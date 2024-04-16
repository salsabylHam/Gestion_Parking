package com.example.gestionParking.repository;

import com.example.gestionParking.entities.Poste;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPosteRepository extends CrudRepository<Poste,Integer> {
}
