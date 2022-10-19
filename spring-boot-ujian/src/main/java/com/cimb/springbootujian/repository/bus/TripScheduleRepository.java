package com.cimb.springbootujian.repository.bus;

import com.cimb.springbootujian.entity.bus.Trip;
import com.cimb.springbootujian.entity.bus.TripSchedule;
import org.springframework.data.repository.CrudRepository;

public interface TripScheduleRepository extends CrudRepository<TripSchedule,Integer> {
    TripSchedule findByTripdetailsAndTripdate(Trip tripdetail, String tripdate);
}
