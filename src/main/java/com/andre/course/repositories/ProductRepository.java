package com.andre.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andre.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
