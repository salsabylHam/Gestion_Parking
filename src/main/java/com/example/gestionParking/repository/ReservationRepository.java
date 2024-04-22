package com.example.gestionParking.repository;

import com.example.gestionParking.entities.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    // You can add custom query methods here if needed
}
