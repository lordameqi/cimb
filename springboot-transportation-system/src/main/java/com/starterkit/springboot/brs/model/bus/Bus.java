package com.starterkit.springboot.brs.model.bus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

//import javax.persistence.*;

@Data
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(
        name = "bus",
        indexes = @Index(
                name = "idx_bus_code",
                columnList = "code",
                unique = true
        )
)
public class Bus {
    @Id
    @Column(name = "bus_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private int capacity;

    private String make;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agency_id")
    private Agency agency;
}
