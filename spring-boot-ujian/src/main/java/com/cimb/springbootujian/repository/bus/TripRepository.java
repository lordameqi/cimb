package com.cimb.springbootujian.repository.bus;

import com.cimb.springbootujian.entity.bus.Agency;
import com.cimb.springbootujian.entity.bus.Bus;
import com.cimb.springbootujian.entity.bus.Stop;
import com.cimb.springbootujian.entity.bus.Trip;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TripRepository extends CrudRepository<Trip,Integer> {
    Trip findBySourcestopsandAndDeststopsandAndBuses(Stop source, Stop destination, Bus bus);

    List<Trip>findAllBySourcestopsAndDeststops(Stop source, Stop dest);

    List<Trip> findByAgencystrips(Agency agency);
}
