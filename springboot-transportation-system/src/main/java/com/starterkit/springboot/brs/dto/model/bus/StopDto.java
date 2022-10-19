package com.starterkit.springboot.brs.dto.model.bus;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@ToString
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
// edited comparable (E)
public class StopDto implements Comparable<Object> {

    private String code;
    private String name;
    private String detail;

    @Override
    public int compareTo(Object o) {
        return this.getName().compareTo(((StopDto) o).getName());
    }
}
