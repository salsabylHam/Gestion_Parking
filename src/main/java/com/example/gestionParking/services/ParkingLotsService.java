package com.example.gestionParking.services;

import com.example.gestionParking.entities.ParkingLots;
import com.example.gestionParking.repository.ParkingLotsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ParkingLotsService {
    @Autowired
    private ParkingLotsRepository parkingLotsRepository;

    public Iterable<ParkingLots> getAllParkingLots() {
        return parkingLotsRepository.findAll();
    }

    public Optional<ParkingLots> getParkingLotById(Long id) {
        return parkingLotsRepository.findById(id);
    }

    public ParkingLots saveParkingLot(ParkingLots parkingLot) {
        return parkingLotsRepository.save(parkingLot);
    }

    public void deleteParkingLotById(Long id) {
        parkingLotsRepository.deleteById(id);
    }
}
