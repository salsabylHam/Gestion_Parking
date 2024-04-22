package com.example.gestionParking.repository;

import com.example.gestionParking.entities.ParkingLots;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingLotsRepository extends CrudRepository<ParkingLots, Long> {
    // You can add custom query methods here if needed
}
