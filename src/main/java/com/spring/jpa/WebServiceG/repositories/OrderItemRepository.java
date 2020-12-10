package com.spring.jpa.WebServiceG.repositories;

import com.spring.jpa.WebServiceG.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
