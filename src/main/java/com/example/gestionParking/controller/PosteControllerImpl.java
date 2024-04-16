package com.example.gestionParking.controller;

import com.example.gestionParking.entities.Poste;
import com.example.gestionParking.services.IGestionPoste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@PreAuthorize("hasRole('ADMIN')")
@RequestMapping("/poste")
public class PosteControllerImpl {
    @Autowired
    IGestionPoste gPoste ;

    @GetMapping("/getall")
    public List<Poste> getAll(){
        return gPoste.retrieveAllPoste();
    }

    @PostMapping("/addPoste")
    public Poste addPoste(@RequestBody Poste poste){
        return gPoste.addPoste(poste);
    }

    @GetMapping("/getPosteById/{idPoste}")
    public Poste getPosteById(@PathVariable("idPoste") Integer idPoste){
        return gPoste.retrievePoste(idPoste);
    }
    @PutMapping("/updatePoste")
    public Poste updatePoste(@RequestBody Poste poste){
        return gPoste.updatePoste(poste);
    }

}
