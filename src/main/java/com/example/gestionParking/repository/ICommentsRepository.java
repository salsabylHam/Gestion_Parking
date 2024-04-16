package com.example.gestionuser.repository;

import com.example.gestionuser.entities.Comments;
import jakarta.persistence.OrderBy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICommentsRepository extends CrudRepository<Comments,Integer> {

     // Tri par date de publication décroissante
     List<Comments> findAllByOrderByDatePubDesc();

}
