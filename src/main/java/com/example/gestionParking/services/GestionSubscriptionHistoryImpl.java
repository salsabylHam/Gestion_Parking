package com.example.gestionParking.services;

import com.example.gestionParking.entities.Subscription;
import com.example.gestionParking.entities.SubscriptionHistory;
import com.example.gestionParking.repository.ISubscriptionHistoryRepository;
import com.example.gestionParking.repository.ISubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GestionSubscriptionHistoryImpl implements IGestionSubscriptionHistory {
    @Autowired
    ISubscriptionHistoryRepository SubhistoryRepo;
    ISubscriptionRepository subscriptionRepo;
    @Override
    public SubscriptionHistory assignHistoryToSubscription(Long numSubHistory , Long numSubscription) {
        Subscription cour = subscriptionRepo.findById(numSubscription).get();
        SubscriptionHistory subscriptionHistory = SubhistoryRepo.findById(numSubHistory).get();
        //subscriptionHistory.setCour(cour);
        return SubhistoryRepo.save(subscriptionHistory);
    }
}
