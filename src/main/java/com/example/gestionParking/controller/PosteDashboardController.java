package com.example.gestionParking.controller;

import com.example.gestionParking.repository.IPosteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/postdashboard")
public class PosteDashboardController {

    private final IPosteRepository posteRepository;

    @Autowired
    public PosteDashboardController(IPosteRepository posteRepository) {
        this.posteRepository = posteRepository;
    }

    @GetMapping("/post-count")
    public ResponseEntity<Map<String, Long>> getPostCount() {
        long totalPostes = posteRepository.countPostes();

        Map<String, Long> counts = new HashMap<>();
        counts.put("totalPostes", totalPostes);

        return ResponseEntity.ok(counts);
    }
}
