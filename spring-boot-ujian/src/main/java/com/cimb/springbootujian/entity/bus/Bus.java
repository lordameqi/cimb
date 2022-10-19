package com.cimb.springbootujian.entity.bus;

import com.cimb.springbootujian.entity.user.User;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Accessors(chain = true)
@Table(name = "bus", indexes = {
        @Index(name = "code", columnList = "code", unique = false)
})
public class Bus {
    @Id
    @Column(name = "bus_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String code;

    private int capacity;

    private String make;

    //referenceKeyAsPrimary
    @OneToMany(mappedBy = "buses", cascade = CascadeType.ALL)
    private List<Trip> buses;

    //referencekeyAsforeign
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agencyID")
    private Agency agencys;

//    private int agencyID;

    public Bus() {
    }

    public Bus(int id, String code, int capacity, String make, List<Trip> buses, Agency agencys) {
        this.id = id;
        this.code = code;
        this.capacity = capacity;
        this.make = make;
        this.buses = buses;
        this.agencys = agencys;
    }

    public Bus(String code, Agency agencys) {
        this.code = code;
        this.agencys = agencys;
    }

    public Bus(String code) {
        this.code = code;
    }
}
