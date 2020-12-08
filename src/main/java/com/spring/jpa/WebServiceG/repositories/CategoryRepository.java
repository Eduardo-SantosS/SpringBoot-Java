package com.spring.jpa.WebServiceG.repositories;

import com.spring.jpa.WebServiceG.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
