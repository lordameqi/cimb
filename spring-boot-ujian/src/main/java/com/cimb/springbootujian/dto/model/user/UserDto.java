package com.cimb.springbootujian.dto.model.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Collection;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@ToString
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto {
    private String email;
    private String password;
    private String firstname;
    private String lastname;
    private String mobilenumber;
    private boolean isAdmin;
    private Collection<RoleDto> roles;

    public String getFullName() {
        return firstname != null ? firstname.concat(" ").concat(lastname) : "";
    }
}
