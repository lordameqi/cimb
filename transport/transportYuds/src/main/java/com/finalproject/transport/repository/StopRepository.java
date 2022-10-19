

package com.finalproject.transport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalproject.transport.entity.bus.Stop;

public interface StopRepository extends JpaRepository<Stop, Long>{

    Stop findByCode(String string);
    
}
