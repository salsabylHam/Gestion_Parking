package com.example.gestionParking.services;

import com.example.gestionParking.entities.Comments;

import java.util.List;

public interface IGestionComments {
    Comments addComment(Comments comments);
    List<Comments> retrieveAllComment();
    Comments updateComment(Comments comments);
    Comments retrieveComment (Integer idComm);

    List<Comments> retrieveAllCommentsOrderedByDate();
}