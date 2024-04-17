package com.example.gestionParking.repository;

import com.example.gestionParking.entities.Comments;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICommentsRepository extends CrudRepository<Comments,Integer> {

    // Tri par date de publication décroissante
    List<Comments> findAllByOrderByDatePubDesc();

}