package com.cimb.springbootujian.repository.bus;

import com.cimb.springbootujian.entity.bus.Agency;
import com.cimb.springbootujian.entity.bus.Bus;
import org.springframework.data.repository.CrudRepository;

public interface BusRepository extends CrudRepository<Bus,Integer> {
    Bus findByCode(String code);

    Bus findByCodeAndAgencys(String code, Agency agency);
}
