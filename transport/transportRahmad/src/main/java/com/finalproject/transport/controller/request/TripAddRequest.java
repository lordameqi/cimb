/*
 * Copyright (c) 2022. Made by Rachmad Fadillah
 */

package com.finalproject.transport.controller.request;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TripAddRequest {

    @NotEmpty(message = "{constraints.NotEmpty.message}")
    private String sourceCode;

    @NotEmpty(message = "{constraints.NotEmpty.message}")
    private String destCode;

    @NotEmpty(message = "{constraints.NotEmpty.message}")
    private String agencyCode;

    @NotEmpty(message = "{constraints.NotEmpty.message}")
    private String busCode;

    @NotEmpty(message = "{constraints.NotEmpty.message}")
    private int journeyTime;

    @NotEmpty(message = "{constraints.NotEmpty.message}")
    private int fare;

}