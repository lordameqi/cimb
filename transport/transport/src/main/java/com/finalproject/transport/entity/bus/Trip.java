/*
 * Copyright (c) 2022. Made by Rachmad Fadillah
 */

package com.finalproject.transport.entity.bus;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Trip {

    @Id
    @Column(name = "trip_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int fare;

    @Column(name = "journey_time")
    private int journeyTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_stop_id")
    private Stop sourceStop;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dest_stop_id")
    private Stop destStop;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bus_id")
    private Bus bus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agency_id")
    private Agency agency;
}
