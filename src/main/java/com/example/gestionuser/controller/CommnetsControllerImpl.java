package com.example.gestionuser.controller;

import com.example.gestionuser.entities.Comments;
import com.example.gestionuser.services.IGestionComments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@PreAuthorize("hasRole('SimpleCLient')")
@RequestMapping("/comments")
public class CommnetsControllerImpl {
    @Autowired
    IGestionComments gComments ;

    @GetMapping("/getall")
    public List<Comments> getAll(){
        return gComments.retrieveAllComment();
    }

    @PostMapping("/addComments")
    public Comments addComments(@RequestBody Comments comments){
        return gComments.addComment(comments);
    }

    @GetMapping("/getCommentsId/{idComm}")
    public Comments getCommentsId(@PathVariable("idComm") Integer idComm){
        return gComments.retrieveComment(idComm);
    }
    @PutMapping("/updatecomments")
    public Comments updatecomments(@RequestBody Comments comments){
        return gComments.updateComment(comments);
    }

    @DeleteMapping("deleteId/{idComm}")
    public void delete(@PathVariable("idComm") Integer idComm){
        gComments.removeComment(idComm);
    }
}
