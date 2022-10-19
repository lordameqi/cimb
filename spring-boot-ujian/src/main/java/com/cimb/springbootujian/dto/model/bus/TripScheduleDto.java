package com.cimb.springbootujian.dto.model.bus;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@ToString
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TripScheduleDto {
    private int id;

    private int tripId;

    private String tripDate;

    private int availableSeats;

    private int fare;

    private int journeyTime;

    private String busCode;

    private String sourceStop;

    private String destinationStop;
}
