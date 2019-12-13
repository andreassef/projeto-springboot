package com.andre.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andre.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
