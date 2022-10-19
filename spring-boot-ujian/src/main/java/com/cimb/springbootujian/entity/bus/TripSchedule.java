package com.cimb.springbootujian.entity.bus;

import com.cimb.springbootujian.entity.user.User;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Accessors(chain = true)
@Table(name = "tripschedule")
public class TripSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tripschedule_id")
    private int id;

    private String tripdate;

    private int availableseats;

    //referenceKeyAsPrimary
    @OneToMany(mappedBy = "tripschedules", cascade = CascadeType.ALL)
    private List<Ticket> ticket;

//    private String tripDetail;

    //referencekeyAsforeign
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ticketsoldsID")
    private Ticket ticketsolds;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tripdetailID")
    private Trip tripdetails;

    public TripSchedule() {
    }

    public TripSchedule(int id, String tripdate, int availableseats, List<Ticket> ticket, Ticket ticketsolds, Trip tripdetails) {
        this.id = id;
        this.tripdate = tripdate;
        this.availableseats = availableseats;
        this.ticket = ticket;
        this.ticketsolds = ticketsolds;
        this.tripdetails = tripdetails;
    }

    public TripSchedule(Trip tripdetails,String tripdate ) {
        this.tripdate = tripdate;
        this.tripdetails = tripdetails;
    }
}
