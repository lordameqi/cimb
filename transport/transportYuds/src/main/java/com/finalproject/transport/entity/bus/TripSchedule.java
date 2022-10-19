
package com.finalproject.transport.entity.bus;

import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TripSchedule {

    @Id
    @Column(name = "trip_schedule_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trip_id")
    private Trip tripDetail;

    @OneToMany(mappedBy = "tripSchedule", cascade = CascadeType.ALL)
    private List<Ticket> ticketsSold;

    @Column(name = "trip_date")
    private String tripDate;

    @Column(name = "available_seats")
    private int availableSeats;
    
}
