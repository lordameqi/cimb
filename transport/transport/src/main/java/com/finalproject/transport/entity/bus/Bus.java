/*
 * Copyright (c) 2022. Made by Rachmad Fadillah
 */

package com.finalproject.transport.entity.bus;

import javax.persistence.*;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Bus {

    @Id
    @Column(name = "bus_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private int capacity;

    private String make;

    private Long agency_id;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "agency_id")
//    private Agency agency;

}
