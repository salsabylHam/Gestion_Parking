package com.example.gestionParking.repository;

import com.example.gestionParking.entities.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ISubscriptionRepository extends JpaRepository<Subscription, Long> {

    @Query("SELECT COUNT(s) FROM Subscription s")
    long countAllSubscriptions();


    @Query("SELECT COUNT(s) FROM Subscription s WHERE s.SubType = 'ANNUEL'")
    long countAnnuelSubscriptions();


    @Query("SELECT COUNT(s) FROM Subscription s WHERE s.SubType = 'MENSUEL'")
    long countMensuelSubscriptions();


    @Query("SELECT COUNT(s) FROM Subscription s WHERE s.SubType = 'SEMESTRIEL'")
    long countSemestrielSubscriptions();

}