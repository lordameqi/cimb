/*
 * Copyright (c) 2022. Made by Rachmad Fadillah
 */

package com.finalproject.transport.entity.bus;

import javax.persistence.*;

import com.finalproject.transport.entity.user.User;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Ticket {

    @Id
    @Column(name = "ticket_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "seat_number")
    private int seatNumber;

    private Boolean cancellable;

    @Column(name = "journey_date")
    private String journeyDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trip_schedule_id")
    private TripSchedule tripSchedule;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User passenger;
}
