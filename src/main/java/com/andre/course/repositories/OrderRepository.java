package com.andre.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andre.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
