package com.starterkit.springboot.brs.model.bus;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "trip_schedule")
public class TripSchedule {
    @Id
    @Column(name = "trip_schedule_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trip_id")
    private Trip tripDetail;

    @OneToMany(mappedBy = "tripSchedule", cascade = CascadeType.ALL)
    private Set<Ticket> ticketsSold;

    @Column(name = "trip_date")
    private String tripDate;

    @Column(name = "available_seats")
    private int availableSeats;
}
