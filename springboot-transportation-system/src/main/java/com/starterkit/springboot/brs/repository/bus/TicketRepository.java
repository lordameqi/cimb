package com.starterkit.springboot.brs.repository.bus;

import com.starterkit.springboot.brs.model.bus.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
