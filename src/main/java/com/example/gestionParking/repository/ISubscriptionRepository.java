package com.example.gestionParking.repository;

import com.example.gestionParking.entities.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISubscriptionRepository extends JpaRepository<Subscription, Long> {

}
