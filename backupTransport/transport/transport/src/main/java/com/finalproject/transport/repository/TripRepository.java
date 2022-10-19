/*
 * Copyright (c) 2022. Made by Rachmad Fadillah
 */

package com.finalproject.transport.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalproject.transport.entity.bus.Bus;
import com.finalproject.transport.entity.bus.Stop;
import com.finalproject.transport.entity.bus.Trip;

public interface TripRepository extends JpaRepository<Trip, Long>{

    Trip findBySourceStopAndDestStopAndBus(Stop stopA, Stop stopB, Bus busA);

    List<Trip> findAllBySourceStopAndDestStop(Stop stop, Stop stop2);
    
}
