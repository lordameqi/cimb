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

import com.starterkit.springboot.brs.model.user.User;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


@Data
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "ticket")
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
