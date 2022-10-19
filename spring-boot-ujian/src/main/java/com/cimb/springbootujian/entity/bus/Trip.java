package com.cimb.springbootujian.entity.bus;

import com.cimb.springbootujian.entity.user.Role;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Accessors(chain = true)
public class Trip {
    @Id
    @Column(name = "trip_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int fare;

    private String journeytime;

    //referenceKeyAsPrimary
    @OneToMany(mappedBy = "tripdetails", cascade = CascadeType.ALL)
    private List<TripSchedule> tripSchedules;

    //referenceKeyAsForeign
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sourcestopID")
    private Stop sourcestops;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "deststopID")
    private Stop deststops;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "busID")
    private Bus buses;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agencyID")
    private Agency agencystrips;

    public Trip() {
    }

    public Trip(int id, int fare, String journeytime, List<TripSchedule> tripSchedules, Stop sourcestops, Stop deststops, Bus buses, Agency agencystrips) {
        this.id = id;
        this.fare = fare;
        this.journeytime = journeytime;
        this.tripSchedules = tripSchedules;
        this.sourcestops = sourcestops;
        this.deststops = deststops;
        this.buses = buses;
        this.agencystrips = agencystrips;
    }

    public Trip(Stop sourcestops, Stop deststops, Bus buses) {
        this.sourcestops = sourcestops;
        this.deststops = deststops;
        this.buses = buses;
    }

    public Trip(Stop sourcestops, Stop deststops) {
        this.sourcestops = sourcestops;
        this.deststops = deststops;
    }

    public Trip(Agency agencystrips) {
        this.agencystrips = agencystrips;
    }
}
