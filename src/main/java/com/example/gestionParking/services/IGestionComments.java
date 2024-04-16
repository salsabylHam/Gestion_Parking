package com.example.gestionuser.services;

import com.example.gestionuser.entities.Comments;
import com.example.gestionuser.entities.Poste;

import java.util.List;

public interface IGestionComments {
    Comments addComment(Comments comments);
    List<Comments> retrieveAllComment();
    Comments updateComment(Comments comments);
    Comments retrieveComment (Integer idComm);

    List<Comments> retrieveAllCommentsOrderedByDate();
}
