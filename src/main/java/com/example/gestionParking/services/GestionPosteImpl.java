package com.example.gestionParking.services;

import com.example.gestionParking.entities.Poste;
import com.example.gestionParking.repository.IPosteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestionPosteImpl implements IGestionPoste{
    @Autowired
    IPosteRepository posteRepo ;

    @Override
    public Poste addPoste(Poste poste) {
        return posteRepo.save(poste);
    }

    @Override
    public List<Poste> retrieveAllPoste() {
        return (List<Poste>) posteRepo.findAll();
    }

    @Override
    public Poste updatePoste(Poste poste) {
        return posteRepo.save(poste);
    }

    @Override
    public Poste retrievePoste(Integer idPoste) {
        return posteRepo.findById(idPoste).orElse(null);
    }
}
