package com.example.gestionParking.repository;
import com.example.gestionParking.entities.Role;
import com.example.gestionParking.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);

    long countByRole(Role role);


}
