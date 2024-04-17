package com.example.gestionuser.repository;

import com.example.gestionuser.entities.Comments;
import com.example.gestionuser.entities.Poste;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPosteRepository extends CrudRepository<Poste,Integer> {
}
