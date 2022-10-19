package com.starterkit.springboot.brs;

import com.starterkit.springboot.brs.model.bus.*;
import com.starterkit.springboot.brs.model.user.Role;
import com.starterkit.springboot.brs.model.user.User;
import com.starterkit.springboot.brs.model.user.UserRoles;
import com.starterkit.springboot.brs.repository.bus.*;
import com.starterkit.springboot.brs.repository.user.RoleRepository;
import com.starterkit.springboot.brs.repository.user.UserRepository;
import com.starterkit.springboot.brs.util.DateUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//@EnableWebMvc
@SpringBootApplication
public class TransportationReservationSystem {

    public static void main(String[] args) {
        SpringApplication.run(TransportationReservationSystem.class, args);
    }

}
