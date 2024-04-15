package com.example.gestionuser.demo;

import com.example.gestionuser.auth.AuthentictionService;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

    private  AuthentictionService authService;

    public DashboardController(AuthentictionService authService) {
        this.authService = authService;
    }

    @GetMapping("/user-count")
    public ResponseEntity<Map<String, Long>> getUserCount() {
        long totalUsers = authService.getTotalUserCount();
        long subscribedUsers = authService.getSubscribedUserCount();
        long simpleUsers = authService.getSimpleUserCount();
        //long regularUsers = totalUsers - subscribedUsers;

        Map<String, Long> counts = new HashMap<>();
        counts.put("totalUsers", totalUsers);
        counts.put("subscribedUsers", subscribedUsers);
        counts.put("simpleUsers", simpleUsers);
       // counts.put("regularUsers", regularUsers);

        return ResponseEntity.ok(counts);
    }
}

