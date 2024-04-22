package com.example.gestionParking.repository;

import com.example.gestionParking.entities.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Long> {
    // You can add custom query methods here if needed
}
