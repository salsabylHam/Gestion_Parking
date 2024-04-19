package com.example.gestionParking.repository;

import com.example.gestionParking.entities.SubscriptionHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISubscriptionHistoryRepository extends JpaRepository<SubscriptionHistory, Long> {
}