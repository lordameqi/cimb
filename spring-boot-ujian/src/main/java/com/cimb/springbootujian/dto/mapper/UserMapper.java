package com.cimb.springbootujian.dto.mapper;

import com.cimb.springbootujian.dto.model.user.RoleDto;
import com.cimb.springbootujian.dto.model.user.UserDto;
import com.cimb.springbootujian.entity.user.User;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.stream.Collectors;

@Component
public class UserMapper {
    public static UserDto toUserDto(User user) {
        return new UserDto()
                .setEmail(user.getEmail())
                .setFirstname(user.getFirstname())
                .setLastname(user.getLastname())
                .setMobilenumber(user.getMobilenumber())
                .setRoles();

    }
}
