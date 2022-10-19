package com.cimb.springbootujian.entity.bus;

import com.cimb.springbootujian.entity.user.Role;
import com.cimb.springbootujian.entity.user.User;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@Accessors(chain = true)
@Table(name = "agency", indexes = {
        @Index(name = "code" ,columnList = "code", unique = false),
        @Index(name = "name" ,columnList = "name",unique = false)
})
public class Agency {
    @Id
    @Column(name = "agency_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "Code Agency Wajib Diisi")
    @NotBlank(message = "Code Agency Stop Tidak Boleh Kosong")
    private String code;

    @NotNull(message = "Name Agency Wajib Diisi")
    @NotBlank(message = "Code Stop Tidak Boleh Kosong")
    private String name;

    @NotNull(message = "Details Agency Wajib Diisi")
    @NotBlank(message = "Details Agency Tidak Boleh Kosong")
    private String details;

    @NotNull(message = "Code Stop Wajib Diisi")
    @NotBlank(message = "Code Stop Tidak Boleh Kosong")
    //referencekeyAsforeign
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OwnerID")
    private User owners;


    //referenceKeyAsPrimary
    @OneToMany(mappedBy = "agencys", cascade = CascadeType.ALL)
    private List<Bus> agency;

    @OneToMany(mappedBy = "agencystrips", cascade = CascadeType.ALL)
    private List<Trip> trips;

    public Agency() {
    }

    public Agency(int id, String code, String name, String details, User owners, List<Bus> agency, List<Trip> trips) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.details = details;
        this.owners = owners;
        this.agency = agency;
        this.trips = trips;
    }

    public Agency(String code) {
        this.code = code;
    }

    public Agency(User owners) {
        this.owners = owners;
    }




}
