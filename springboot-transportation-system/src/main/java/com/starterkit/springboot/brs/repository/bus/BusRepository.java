package com.starterkit.springboot.brs.repository.bus;

import com.starterkit.springboot.brs.model.bus.Agency;
import com.starterkit.springboot.brs.model.bus.Bus;
import org.springframework.data.repository.CrudRepository;

public interface BusRepository extends CrudRepository<Bus, Long> {
    Bus findByCode(String busCode);

    Bus findByCodeAndAgency(String busCode, Agency agency);
}
