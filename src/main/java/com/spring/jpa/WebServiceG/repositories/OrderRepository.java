package com.spring.jpa.WebServiceG.repositories;

import com.spring.jpa.WebServiceG.entities.Order;
import com.spring.jpa.WebServiceG.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
