package com.ian.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ian.curso.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
