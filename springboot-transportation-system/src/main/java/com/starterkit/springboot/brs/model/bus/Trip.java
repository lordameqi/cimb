package com.starterkit.springboot.brs.model.bus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "trip")
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
