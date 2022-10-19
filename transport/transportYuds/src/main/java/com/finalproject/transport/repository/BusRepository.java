

package com.finalproject.transport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalproject.transport.entity.bus.Bus;

public interface BusRepository extends JpaRepository<Bus, Long> {

    Bus findByCode(String string);
    
}
