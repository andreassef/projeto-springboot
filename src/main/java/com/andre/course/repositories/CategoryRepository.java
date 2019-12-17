package com.andre.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andre.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
