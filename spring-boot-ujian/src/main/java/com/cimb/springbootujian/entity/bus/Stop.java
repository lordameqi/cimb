package com.cimb.springbootujian.entity.bus;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@Accessors(chain = true)
@Table(name = "stop", indexes = @Index(
        name = "code", columnList = "code",unique = false)
)
public class Stop {

    @Id
    @Column(name = "stop_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "Code Stop Wajib Diisi")
    @NotBlank(message = "Code Stop Tidak Boleh Kosong")
    private String code;

    @NotNull(message = "Email Wajib Diisi")
    @NotBlank(message = "Email Tidak Boleh Kosong")
    private String name;

    @NotNull(message = "Detail Wajib Diisi")
    @NotBlank(message = "Detail Tidak Boleh Kosong")
    private String detail;

    //referenceKeyAsPrimary
    @OneToMany(mappedBy = "sourcestops", cascade = CascadeType.ALL)
    private List<Trip> sourcestop;

        @OneToMany(mappedBy = "deststops", cascade = CascadeType.ALL)
    private List<Trip> deststop;

    public Stop() {
    }

    public Stop(int id, String code, String name, String detail, List<Trip> sourcestop, List<Trip> deststop) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.detail = detail;
        this.sourcestop = sourcestop;
        this.deststop = deststop;
    }

    public Stop(String code) {
        this.code = code;
    }
}
