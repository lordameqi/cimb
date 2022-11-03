/*
 * Copyright (c) 2022. Made by Rachmad Fadillah
 */

package com.finalproject.transport.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.finalproject.transport.repository.*;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import com.finalproject.transport.dto.mapper.TicketMapper;
import com.finalproject.transport.dto.mapper.TripMapper;
import com.finalproject.transport.dto.mapper.TripScheduleMapper;
import com.finalproject.transport.dto.model.bus.TicketDto;
import com.finalproject.transport.dto.model.bus.TripDto;
import com.finalproject.transport.dto.model.bus.TripScheduleDto;
import com.finalproject.transport.dto.model.user.UserDto;
import com.finalproject.transport.entity.bus.Stop;
import com.finalproject.transport.entity.bus.Ticket;
import com.finalproject.transport.entity.bus.Trip;
import com.finalproject.transport.entity.bus.TripSchedule;
import com.finalproject.transport.entity.user.User;

@Component
public class BusReservationService {

    @Autowired
    private AgencyRepository agencyRepository;

    @Autowired
    private BusRepository busRepository;

    @Autowired
    private StopRepository stopRepository;

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private TripRepository tripRepository;

    @Autowired
    private TripScheduleRepository tripScheduleRepository;

    @Autowired
    private UserRepository userRepository;

    public Collection<Stop> getAllStops() {
        return stopRepository.findAll();
    }

    public Stop getStopByCode(String stopCode) {
        return stopRepository.findByCode(stopCode);
    }

    public List<TripDto> getAvailableTripsBetweenStops(String sourceStopCode, String destinationStopCode) {
        List<Trip> availableTrips = findTripsBetweenStops(sourceStopCode, destinationStopCode);
        if (!availableTrips.isEmpty()) {
            return availableTrips
                    .stream()
                    .map(trip -> TripMapper.toTripDto(trip))
                    .collect(Collectors.toList());
        }
        return Collections.emptyList();
    }

    private List<Trip> findTripsBetweenStops(String sourceStopCode, String destinationStopCode) {
        Optional<Stop> sourceStop = Optional
                .ofNullable(stopRepository.findByCode(sourceStopCode));
        if (sourceStop.isPresent()) {
            Optional<Stop> destStop = Optional
                    .ofNullable(stopRepository.findByCode(destinationStopCode));
            if (destStop.isPresent()) {
                List<Trip> availableTrips = tripRepository.findAllBySourceStopAndDestStop(sourceStop.get(),
                        destStop.get());
                if (!availableTrips.isEmpty()) {
                    return availableTrips;
                }
                return Collections.emptyList();
            }
            return Collections.emptyList();
            // throw exception(STOP, ENTITY_NOT_FOUND, destinationStopCode);
        }
        return Collections.emptyList();
        // throw exception(STOP, ENTITY_NOT_FOUND, sourceStopCode);
    }

    public List<TripScheduleDto> getAvailableTripSchedules(String sourceStopCode, String destinationStopCode,
            String tripDate) {
        List<Trip> availableTrips = findTripsBetweenStops(sourceStopCode, destinationStopCode);
        if (!availableTrips.isEmpty()) {
            return availableTrips
                    .stream()
                    .map(trip -> getTripSchedule(TripMapper.toTripDto(trip), tripDate, true))
                    .filter(tripScheduleDto -> tripScheduleDto != null)
                    .collect(Collectors.toList());
        }
        return Collections.emptyList();
    }

    public TripScheduleDto getTripSchedule(TripDto tripDto, String tripDate, boolean createSchedForTrip) {
        Optional<Trip> trip = tripRepository.findById(tripDto.getId());
        if (trip.isPresent()) {
            Optional<TripSchedule> tripSchedule = Optional
                    .ofNullable(tripScheduleRepository.findByTripDetailAndTripDate(trip.get(), tripDate));
            if (tripSchedule.isPresent()) {
                return TripScheduleMapper.toTripScheduleDto(tripSchedule.get());
            } else {
                if (createSchedForTrip) { // create the schedule
                    TripSchedule tripSchedule1 = new TripSchedule();
                    tripSchedule1.setTripDetail(trip.get());
                    tripSchedule1.setTripDate(tripDate);
                    tripSchedule1.setAvailableSeats(trip.get().getBus().getCapacity());
                    return TripScheduleMapper.toTripScheduleDto(tripScheduleRepository.save(tripSchedule1));
                } else {
                    return null;
                    // throw exceptionWithId(TRIP, ENTITY_NOT_FOUND, 2, tripDto.getId().toString(), tripDate);
                }
            }
        }
        return null;
        // throw exception(TRIP, ENTITY_NOT_FOUND, tripDto.getId().toString());
    }

    public TripDto getTripById(Long tripID) {
        Optional<Trip> trip = tripRepository.findById(tripID);
        if (trip.isPresent()) {
            return TripMapper.toTripDto(trip.get());
        }
        return null;
        // throw exception(TRIP, ENTITY_NOT_FOUND, tripID.toString());
    }

    @Transactional
    public TicketDto bookTicket(TripScheduleDto tripScheduleDto, UserDto userDto) {
        User user = getUser(userDto.getEmail());
        if (user != null) {
            Optional<TripSchedule> tripSchedule = tripScheduleRepository.findById(tripScheduleDto.getId());
            if (tripSchedule.isPresent()) {
                Ticket ticket = new Ticket();
                ticket.setCancellable(false);
                ticket.setJourneyDate(tripSchedule.get().getTripDate());
                ticket.setPassenger(user);
                ticket.setTripSchedule(tripSchedule.get());
                ticket.setSeatNumber(tripSchedule.get().getTripDetail().getBus().getCapacity() - tripSchedule.get().getAvailableSeats());
                ticketRepository.save(ticket);
                tripSchedule.get().setAvailableSeats(tripSchedule.get().getAvailableSeats() - 1); //reduce availability by 1
                tripScheduleRepository.save(tripSchedule.get());//update schedule
                return TicketMapper.toTicketDto(ticket);
            }
            return null;
            // throw exceptionWithId(TRIP, ENTITY_NOT_FOUND, 2, tripScheduleDto.getTripId().toString(), tripScheduleDto.getTripDate());
        }
        return null;
        // throw exception(USER, ENTITY_NOT_FOUND, userDto.getEmail());
    }

    private User getUser(String email) {
        return userRepository.findByEmail(email);
    }

    // private RuntimeException exception(EntityType entityType, ExceptionType
    // exceptionType, String... args) {
    // return BRSException.throwException(entityType, exceptionType, args);
    // }

}
