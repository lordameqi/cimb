/*
 * Copyright (c) 2022. Made by Rachmad Fadillah
 */

package com.finalproject.transport.entity.user;

import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String email;
    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @ManyToMany
    @Column(name = "role")
    @JoinTable(name = "user_role",
    joinColumns = { @JoinColumn(name = "user_id") },
    inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private List<Role> roles;

    public String getFullName() {
        return null;
    }

}
