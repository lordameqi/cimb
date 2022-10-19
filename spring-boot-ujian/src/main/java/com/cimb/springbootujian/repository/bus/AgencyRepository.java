package com.cimb.springbootujian.repository.bus;

import com.cimb.springbootujian.entity.bus.Agency;
import com.cimb.springbootujian.entity.user.User;
import org.springframework.data.repository.CrudRepository;

public interface AgencyRepository extends CrudRepository<Agency, Integer> {
        Agency findByCode(String code);

        Agency findByOwner(User owner);

        Agency findByName(String name);
}
