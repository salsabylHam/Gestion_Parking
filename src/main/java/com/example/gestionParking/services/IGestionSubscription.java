package com.example.gestionParking.services;

import com.example.gestionParking.entities.Subscription;

import java.util.List;

public interface IGestionSubscription {
    List<Subscription> retrieveAllSubscription();
    Subscription addSubscription(Subscription subscription);
    Subscription updateSubscription (Subscription subscription);
    Subscription retrieveSubscription (Long id);
}
