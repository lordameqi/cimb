package com.cimb.springbootujian.entity.bus;

import com.cimb.springbootujian.entity.user.User;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@Accessors(chain = true)
@Table(name = "ticket")
public class Ticket {
    @Id
    @Column(name = "ticket_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "SeatNumber Ticket Wajib Diisi")
    @NotBlank(message = "SeatNumber Ticket Tidak Boleh Kosong")
    private int seatnumber;

    @NotNull(message = "Cancellable Ticket Wajib Diisi")
    @NotBlank(message = "Cancellable Ticket Tidak Boleh Kosong")
    private boolean cancellable;

    private String journeyDate;

    //referenceKeyAsPrimary
    @OneToMany(mappedBy = "ticketsolds", cascade = CascadeType.ALL)
    private List<TripSchedule> tripSchedule;


    //referencekeyAsforeign
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "passengerID")
    private User passengers;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tripscheduleID")
    private TripSchedule tripschedules;

    public Ticket() {
    }

    public Ticket(int id, int seatnumber, boolean cancellable, String journeyDate, List<TripSchedule> tripSchedule, User passengers, TripSchedule tripschedules) {
        this.id = id;
        this.seatnumber = seatnumber;
        this.cancellable = cancellable;
        this.journeyDate = journeyDate;
        this.tripSchedule = tripSchedule;
        this.passengers = passengers;
        this.tripschedules = tripschedules;
    }
}
