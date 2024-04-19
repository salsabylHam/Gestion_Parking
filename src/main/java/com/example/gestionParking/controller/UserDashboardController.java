package com.example.gestionParking.controller;

import com.example.gestionParking.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/userdashboard")
public class UserDashboardController {

    private final IUserRepository userRepository;

    @Autowired
    public UserDashboardController(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/user-count")
    public ResponseEntity<Map<String, Long>> getUserCount() {
        long totalUsers = userRepository.getTotalUserCount();
        long subscribedUsers = userRepository.getSubscribedUserCount();
        long simpleUsers = userRepository.getSimpleUserCount();

        Map<String, Long> counts = new HashMap<>();
        counts.put("totalUsers", totalUsers);
        counts.put("subscribedUsers", subscribedUsers);
        counts.put("simpleUsers", simpleUsers);

        return ResponseEntity.ok(counts);
    }
}
