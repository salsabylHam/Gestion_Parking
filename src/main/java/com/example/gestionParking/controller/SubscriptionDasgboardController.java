package com.example.gestionParking.controller;


import com.example.gestionParking.repository.ISubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/subscriptiondashboard")
public class SubscriptionDasgboardController {
    private final ISubscriptionRepository subscriptionRepository;

    @Autowired
    public SubscriptionDasgboardController(ISubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }

    @GetMapping("/subscription-count")
    public ResponseEntity<Map<String, Long>> getSubscriptionCount() {
        long totalSubscriptions = subscriptionRepository.countAllSubscriptions();
        long annuelCount = subscriptionRepository.countAnnuelSubscriptions();
        long mensuelCount = subscriptionRepository.countMensuelSubscriptions();
        long semestrielCount = subscriptionRepository.countSemestrielSubscriptions();

        Map<String, Long> counts = new HashMap<>();
        counts.put("totalSubscriptions", totalSubscriptions);
        counts.put("annuelSubscriptions", annuelCount);
        counts.put("mensuelSubscriptions", mensuelCount);
        counts.put("semestrielSubscriptions", semestrielCount);

        return ResponseEntity.ok(counts);
    }
}
