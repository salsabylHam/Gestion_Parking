package com.example.gestionuser.services;

import com.example.gestionuser.entities.Poste;
import com.example.gestionuser.repository.IPosteRepository;
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
