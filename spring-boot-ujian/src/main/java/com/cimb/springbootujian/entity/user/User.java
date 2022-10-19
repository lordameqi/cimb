package com.cimb.springbootujian.entity.user;

import com.cimb.springbootujian.entity.bus.Agency;
import com.cimb.springbootujian.entity.bus.Ticket;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Getter
@Setter
@Data
@Accessors(chain = true)
@Table(name = "user",
        indexes = @Index(
                name = "user_email",
                columnList = "email",
                unique = true
        ))
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "Email Wajib Diisi")
    @NotBlank(message = "Email Tidak Boleh Kosong")
    private String email;

    @NotNull(message = "Password Wajib Diisi")
    @NotBlank(message = "Password Tidak Boleh Kosong")
    private String password;

    @NotNull(message = "firstname Wajib Diisi")
    @NotBlank(message = "firstname Tidak Boleh Kosong")
    private String firstname;

    @NotNull(message = "lastname Wajib Diisi")
    @NotBlank(message = "lastname Tidak Boleh Kosong")
    private String lastname;

    @NotNull(message = "Mobile Number Wajib Diisi")
    @NotBlank(message = "Mobile Number Tidak Boleh Kosong")
    private String mobilenumber;


    //referenceKeyAsForeign
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rolesID")
    private Role roles;


    //referenceKeyAsPrimary
    @OneToMany(mappedBy = "owners", cascade = CascadeType.ALL)
    private List<Agency> owner;

    @OneToMany(mappedBy = "passengers", cascade = CascadeType.ALL)
    private List<Ticket> ticket;


    public User() {
    }

    public User(int id, String email, String password, String firstname, String lastname, String mobilenumber, Role roles, List<Agency> owner, List<Ticket> ticket) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.mobilenumber = mobilenumber;
        this.roles = roles;
        this.owner = owner;
        this.ticket = ticket;
    }

    public User(String email) {
        this.email = email;
    }

    public String getFullName() {
        return firstname != null ? firstname.concat(" ").concat(lastname) : "";
    }
}
