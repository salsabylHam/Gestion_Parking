package com.example.gestionParking.services;

import com.example.gestionParking.entities.Comments;
import com.example.gestionParking.repository.ICommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestionCommentsImpl  implements IGestionComments{

    @Autowired
    ICommentsRepository commentRepo ;

    @Override
    public Comments addComment(Comments comments) {
        return commentRepo.save(comments);
    }

    @Override
    public List<Comments> retrieveAllComment() {
        return (List<Comments>) commentRepo.findAll();
    }

    @Override
    public Comments updateComment(Comments comments) {
        return commentRepo.save(comments);
    }

    @Override
    public Comments retrieveComment(Integer idComm) {
        return commentRepo.findById(idComm).orElse(null);
    }

    @Override
    public List<Comments> retrieveAllCommentsOrderedByDate() {
        return commentRepo.findAllByOrderByDatePubDesc();
    }

}
