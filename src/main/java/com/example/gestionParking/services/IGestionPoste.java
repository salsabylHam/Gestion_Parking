package com.example.gestionParking.services;

import com.example.gestionParking.entities.Poste;

import java.util.List;

public interface IGestionPoste {
    Poste addPoste(Poste poste);
    List<Poste> retrieveAllPoste();
    Poste updatePoste(Poste poste);
    Poste retrievePoste (Integer idPoste);
}
