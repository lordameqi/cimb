

package com.finalproject.transport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalproject.transport.entity.bus.Agency;

public interface AgencyRepository extends JpaRepository<Agency, Long>{

    Agency findByCode(String string);
    Agency findByName(String name);
    
}
