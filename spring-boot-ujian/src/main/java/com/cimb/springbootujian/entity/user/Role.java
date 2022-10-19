package com.cimb.springbootujian.entity.user;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.nio.channels.FileChannel;
import java.util.List;

@Entity
@Accessors(chain = true)
@Data
@Table(name = "role")
public class Role {
    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "Role ditable Role Wajib Diisi")
    @NotBlank(message = "Role ditable ROle Tidak Boleh Kosong")


    //references As Primary
    @OneToMany(mappedBy = "roles", cascade = CascadeType.ALL)
    private List<User> role;

    private String roles;


    public Role() {
    }

    public Role(int id, List<User> role, String roles) {
        this.id = id;
        this.role = role;
        this.roles = roles;
    }

    public Role(int id) {
        this.id = id;
    }


    public FileChannel stream() {
    }
}
