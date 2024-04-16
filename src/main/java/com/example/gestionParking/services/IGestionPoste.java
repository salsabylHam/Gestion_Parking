package com.example.gestionuser.services;

import com.example.gestionuser.entities.Poste;

import java.util.List;

public interface IGestionPoste {
    Poste addPoste(Poste poste);
    List<Poste> retrieveAllPoste();
    Poste updatePoste(Poste poste);
    Poste retrievePoste (Integer idPoste);
}
