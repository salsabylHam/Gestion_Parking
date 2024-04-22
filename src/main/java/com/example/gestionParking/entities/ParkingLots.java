package com.example.gestionParking.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ParkingLots implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLot;
    private String name;
    private int capacity;
    // Other fields and methods

    @OneToMany(mappedBy = "parkingLot")
    private List<ParkingSpot> parkingSpots;
}