package com.example.gestionParking.services;

import com.example.gestionParking.entities.SubscriptionHistory;

public interface IGestionSubscriptionHistory {
    SubscriptionHistory assignHistoryToSubscription(Long numSubHistory , Long numSubscription);
}
