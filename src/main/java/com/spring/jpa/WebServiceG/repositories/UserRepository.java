package com.spring.jpa.WebServiceG.repositories;

import com.spring.jpa.WebServiceG.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
