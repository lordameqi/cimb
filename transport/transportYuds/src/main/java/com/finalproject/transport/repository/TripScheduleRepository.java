

package com.finalproject.transport.repository;

import org.springframework.data.repository.CrudRepository;

import com.finalproject.transport.entity.bus.Trip;
import com.finalproject.transport.entity.bus.TripSchedule;

public interface TripScheduleRepository extends CrudRepository<TripSchedule, Long> {

    TripSchedule findByTripDetailAndTripDate(Trip trip, String string);
}
