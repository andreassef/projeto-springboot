package com.andre.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andre.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
