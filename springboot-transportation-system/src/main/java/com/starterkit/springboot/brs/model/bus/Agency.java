package com.starterkit.springboot.brs.model.bus;

import com.starterkit.springboot.brs.model.user.User;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "agency",
        indexes = @Index(
                name = "idx_agency_code",
                columnList = "code",
                unique = true
        ))
public class Agency {
    @Id
    @Column(name = "agency_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private String name;

    private String details;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_user_id")
    private User owner;

    @OneToMany(mappedBy = "agency", cascade = CascadeType.ALL)
    private Set<Bus> buses;
}