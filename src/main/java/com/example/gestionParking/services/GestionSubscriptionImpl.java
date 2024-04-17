package com.example.gestionParking.services;

import com.example.gestionParking.entities.Subscription;
import com.example.gestionParking.repository.ISubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestionSubscriptionImpl implements IGestionSubscription{
    @Autowired
    ISubscriptionRepository SubscriptionRepo;

        public List<Subscription> retrieveAllSubscription() {
            // TODO Auto-generated method stub
            return SubscriptionRepo.findAll();
        };
    @Override
    public Subscription addSubscription(Subscription subscription) {
        // TODO Auto-generated method stub
        return SubscriptionRepo.save(subscription);
    }

    @Override
    public Subscription updateSubscription(Subscription subscription) {
        // TODO Auto-generated method stub
        return SubscriptionRepo.save(subscription);
    }

    @Override
    public Subscription retrieveSubscription(Long idSub) {
        // TODO Auto-generated method stub
        return SubscriptionRepo.findById(idSub).get();
    }

}
