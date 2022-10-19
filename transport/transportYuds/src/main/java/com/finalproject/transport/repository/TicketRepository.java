

package com.finalproject.transport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalproject.transport.entity.bus.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long>{
    
}
