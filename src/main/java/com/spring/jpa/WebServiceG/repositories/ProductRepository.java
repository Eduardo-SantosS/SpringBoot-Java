package com.spring.jpa.WebServiceG.repositories;

import com.spring.jpa.WebServiceG.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
