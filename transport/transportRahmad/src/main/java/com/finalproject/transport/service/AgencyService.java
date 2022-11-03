///*
// * Copyright (c) 2022. Made by Rachmad Fadillah
// */
//
//package com.finalproject.transport.service;
//
//import com.finalproject.transport.controller.request.TripAddRequest;
//import com.finalproject.transport.entity.bus.Agency;
//import com.finalproject.transport.entity.bus.Bus;
//import com.finalproject.transport.entity.bus.Stop;
//import com.finalproject.transport.entity.bus.Trip;
//import com.finalproject.transport.repository.*;
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class AgencyService {
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private AgencyRepository agencyRepository;
//
//    @Autowired
//    private BusRepository busRepository;
//
//    @Autowired
//    private StopRepository stopRepository;
//
//    @Autowired
//    private TripRepository tripRepository;
//    public Trip addTrip(TripAddRequest tripRequest){
//        Agency agency = agencyRepository.findByCode(tripRequest.getAgencyCode());
//        Bus bus = busRepository.findByCode(tripRequest.getBusCode());
//        Stop sourceStop = stopRepository.findByCode(tripRequest.getSourceCode());
//        Stop destStop = stopRepository.findByCode(tripRequest.getDestCode());
//
//        Trip trip = new Trip();
//
//        trip.setAgency(agency);
//        trip.setBus(bus);
//        trip.setSourceStop(sourceStop);
//        trip.setDestStop(destStop);
//        trip.setJourneyTime(tripRequest.getJourneyTime());
//        trip.setFare(tripRequest.getFare());
//
//        return tripRepository.save(trip);
//    }
//}
