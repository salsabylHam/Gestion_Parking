package com.example.gestionParking.repository;

import com.example.gestionParking.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    @Query(value = "SELECT COUNT(*) FROM User", nativeQuery = true)
    long getTotalUserCount();

    @Query(value = "SELECT COUNT(*) FROM User WHERE role = 'SubscribedClient'", nativeQuery = true)
    long getSubscribedUserCount();

    @Query(value = "SELECT COUNT(*) FROM User WHERE role = 'SimpleClient'", nativeQuery = true)
    long getSimpleUserCount();

}
