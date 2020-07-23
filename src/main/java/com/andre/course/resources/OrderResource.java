package com.andre.course.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andre.course.entities.Order;
import com.andre.course.repositories.OrderRepository;

@RestController
@RequestMapping(value = "api/orders")
public class OrderResource {
	
	@Autowired
	private OrderRepository service;
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list = service.findAll();
		//Order u = new Order(1L, "Maria", "maria@gmail", "1234567890", "123456");
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Optional<Order> obj = service.findById(id);
		return ResponseEntity.ok().body(obj.get());
	}
}
