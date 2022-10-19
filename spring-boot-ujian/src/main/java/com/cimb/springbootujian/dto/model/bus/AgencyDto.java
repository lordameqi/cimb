package com.cimb.springbootujian.dto.model.bus;

import com.cimb.springbootujian.dto.model.user.UserDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.Set;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@ToString
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AgencyDto {
    private String code;

    private UserDto owner;

    private Set<BusDto> buses;

    private String name;

    private String details;
}
