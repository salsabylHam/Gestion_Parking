package com.example.gestionuser.auth;

import com.example.gestionuser.entities.Comments;
import com.example.gestionuser.entities.Poste;
import com.example.gestionuser.services.IGestionComments;
import com.example.gestionuser.services.IGestionPoste;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthentictionService service;
    @Autowired
    IGestionComments gComments ;
    @Autowired
    IGestionPoste gPoste ;
    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request
    ) {
        return ResponseEntity.ok(service. register(request));
    }
    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request
    ) {
        return ResponseEntity.ok(service.authenticate(request));
    }

//    @PostMapping("/refresh-token")
//    public void refreshToken(
//            HttpServletRequest request,
//            HttpServletResponse response
//    ) throws IOException {
//        service.refreshToken(request, response);
//    }
@PostMapping("/addComments")
public Comments addComments(@RequestBody Comments comments){
    return gComments.addComment(comments);
}
    @PostMapping("/addPoste")
    public Poste addPoste(@RequestBody Poste poste){
        return gPoste.addPoste(poste);
    }
}

