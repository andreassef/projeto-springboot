package com.andre.course.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andre.course.entities.Category;
import com.andre.course.repositories.CategoryRepository;

@RestController
@RequestMapping(value = "api/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryRepository service;
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = service.findAll();
		//Category u = new Category(1L, "Maria", "maria@gmail", "1234567890", "123456");
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Optional<Category> obj = service.findById(id);
		return ResponseEntity.ok().body(obj.get());
	}
}
