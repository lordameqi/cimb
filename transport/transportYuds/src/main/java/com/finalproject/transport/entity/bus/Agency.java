
package com.finalproject.transport.entity.bus;

import java.util.List;

import javax.persistence.*;

import com.finalproject.transport.entity.user.User;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
public class Agency {

    @Id
    @Column(name = "agency_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private String name;

    private String details;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "owner_user_id")
//    private User owner;

    private Long owner_user_id;

//    @OneToMany(mappedBy = "agency", cascade = CascadeType.ALL)
//    private List<Bus> buses;
}
