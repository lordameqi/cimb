

package com.finalproject.transport.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import com.finalproject.transport.entity.bus.Agency;
import com.finalproject.transport.entity.bus.Bus;
import com.finalproject.transport.repository.AgencyRepository;
import com.finalproject.transport.repository.BusRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.stereotype.Component;

import com.finalproject.transport.dto.mapper.UserMapper;
import com.finalproject.transport.dto.model.user.UserDto;
import com.finalproject.transport.entity.user.Role;
import com.finalproject.transport.entity.user.User;
import com.finalproject.transport.entity.user.UserRole;
import com.finalproject.transport.repository.RoleRepository;
import com.finalproject.transport.repository.UserRepository;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Component
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class UserService {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;


    @Autowired
    private AgencyRepository ar;

    @Autowired
    private BusRepository br;


    private ModelMapper modelMapper = new ModelMapper();

    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public UserDto findUserByEmail(String email) {
        Optional<User> user = Optional.ofNullable(userRepository.findByEmail(email));
        if (user.isPresent()) {
            return modelMapper.map(user.get(), UserDto.class);
        }
        return null;
        // throw exception(USER, ENTITY_NOT_FOUND, email);
    }

    public UserDto signup(UserDto userDto) {
        Role userRole;
        User user = userRepository.findByEmail(userDto.getEmail());
        if (user == null) {
            if (userDto.isAdmin()) {
                userRole = roleRepository.findByRole(UserRole.ADMIN);
            } else {
                userRole = roleRepository.findByRole(UserRole.PASSENGER);
            }
            user = new User();
            user.setEmail(userDto.getEmail());
            user.setPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));
            user.setRoles(Arrays.asList(userRole));
            user.setFirstName(userDto.getFirstName());
            user.setLastName(userDto.getLastName());
            user.setMobileNumber(userDto.getMobileNumber());
            return UserMapper.toUserDto(userRepository.save(user));
        }
        return null;
        // throw exception(USER, DUPLICATE_ENTITY, userDto.getEmail());
    }

    public UserDto signupAdmin(UserDto userDto) {
        Role userRole;
        User user = userRepository.findByEmail(userDto.getEmail());
        if (user == null) {
            if (userDto.isAdmin()) {
                userRole = roleRepository.findByRole(UserRole.ADMIN);
            } else {
                userRole = roleRepository.findByRole(UserRole.PASSENGER);
            }
            user = new User();
            user.setEmail(userDto.getEmail());
            user.setPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));
            user.setRoles(Arrays.asList(userRole));
            user.setFirstName(userDto.getFirstName());
            user.setLastName(userDto.getLastName());
            user.setMobileNumber(userDto.getMobileNumber());
            return UserMapper.toUserDto(userRepository.save(user));
        }
        return null;
        // throw exception(USER, DUPLICATE_ENTITY, userDto.getEmail());
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User save(User user) {

        return userRepository.save(user);
    }

    public Bus postBuss (Bus bus) {
        return br.save(bus);
    }

}
