package com.finalproject.transport.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.finalproject.transport.controller.request.BookTicketRequest;
import com.finalproject.transport.controller.request.GetTripSchedulesRequest;
import com.finalproject.transport.dto.model.bus.TicketDto;
import com.finalproject.transport.dto.model.bus.TripDto;
import com.finalproject.transport.dto.model.bus.TripScheduleDto;
import com.finalproject.transport.dto.model.user.UserDto;
import com.finalproject.transport.dto.response.Response;
import com.finalproject.transport.service.BusReservationService;
import com.finalproject.transport.service.UserService;
import com.finalproject.transport.util.DateUtils;

@RestController
@RequestMapping("/api/v1/reservation")
public class BusReservationController {

    @Autowired
    private BusReservationService busReservationService;

    @Autowired
    private UserService userService;

    @GetMapping("/stops")
    @PreAuthorize("hasRole('ADMIN')")
    public Response getAllStops() {
        return Response
                .ok()
                .setPayload(busReservationService.getAllStops());
    }

    @GetMapping("/tripsbystops")
    @PreAuthorize("hasRole('ADMIN')")
    public Response getTripsByStops(@RequestBody @Valid GetTripSchedulesRequest getTripSchedulesRequest) {
        List<TripDto> tripDtos = busReservationService.getAvailableTripsBetweenStops(
                getTripSchedulesRequest.getSourceStop(),
                getTripSchedulesRequest.getDestinationStop());

            return Response.ok().setPayload(tripDtos);
    }

    @GetMapping("/tripschedules")
    @PreAuthorize("hasRole('ADMIN')")
    public Response getTripSchedules(@RequestBody @Valid GetTripSchedulesRequest getTripSchedulesRequest) {
        List<TripScheduleDto> tripScheduleDtos = busReservationService.getAvailableTripSchedules(
                getTripSchedulesRequest.getSourceStop(),
                getTripSchedulesRequest.getDestinationStop(),
                DateUtils.formattedDate(getTripSchedulesRequest.getTripDate()));
        if (!tripScheduleDtos.isEmpty()) {
            return Response.ok().setPayload(tripScheduleDtos);
        }
        return Response.notFound()
                .setErrors(String.format("No trips between source stop - '%s' and destination stop - '%s' on date - '%s' are available at this time.", getTripSchedulesRequest.getSourceStop(), getTripSchedulesRequest.getDestinationStop(), DateUtils.formattedDate(getTripSchedulesRequest.getTripDate())));
    }

    @PostMapping("/bookticket")
    @PreAuthorize("hasRole('ADMIN')")
    public Response bookTicket(@RequestBody @Valid BookTicketRequest bookTicketRequest) {
        Optional<UserDto> userDto = Optional.ofNullable(userService.findUserByEmail("admin@gmail.com"));
        if (true /*userDto.isPresent()*/) {
            Optional<TripDto> tripDto = Optional
                    .ofNullable(busReservationService.getTripById(bookTicketRequest.getTripID()));
            if (tripDto.isPresent()) {
                Optional<TripScheduleDto> tripScheduleDto = Optional
                        .ofNullable(busReservationService.getTripSchedule(tripDto.get(), DateUtils.formattedDate(bookTicketRequest.getTripDate()), true));
                if (tripScheduleDto.isPresent()) {
                    Optional<TicketDto> ticketDto = Optional
                            .ofNullable(busReservationService.bookTicket(tripScheduleDto.get(), userDto.get()));
                    if (ticketDto.isPresent()) {
                        return Response.ok().setPayload(ticketDto.get());
                    }
                }
            }
        }
        return Response.badRequest().setErrors("Unable to process ticket booking.");
    }
}
