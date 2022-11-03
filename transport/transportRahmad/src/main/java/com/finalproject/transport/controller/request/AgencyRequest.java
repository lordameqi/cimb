///*
// * Copyright (c) 2022. Made by Rachmad Fadillah
// */
//
//package com.finalproject.transport.controller.request;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.experimental.Accessors;
//
//import javax.validation.constraints.NotEmpty;
//
//@Getter
//@Setter
//@Accessors(chain = true)
//@NoArgsConstructor
//@JsonIgnoreProperties(ignoreUnknown = true)
//public class AgencyRequest {
//    @NotEmpty(message = "{constraints.NotEmpty.message}")
//    private String code;
//
//    @NotEmpty(message = "{constraints.NotEmpty.message}")
//    private String owner;
//
//    @NotEmpty(message = "{constraints.NotEmpty.message}")
//    private String buses;
//
//    @NotEmpty(message = "{constraints.NotEmpty.message}")
//    private String name;
//
//    private String details;
//}