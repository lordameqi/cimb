package com.cimb.springbootujian.repository.bus;

import com.cimb.springbootujian.entity.bus.Stop;
import org.springframework.data.repository.CrudRepository;

public interface StopRepository extends CrudRepository<Stop, Integer> {
    Stop findByCode(String code);
}
