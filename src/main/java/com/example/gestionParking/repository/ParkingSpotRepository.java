package com.example.gestionParking.repository;

import com.example.gestionParking.entities.ParkingSpot;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingSpotRepository extends CrudRepository<ParkingSpot, Long> {
    // You can add custom query methods here if needed
}
