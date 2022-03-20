package com.ian.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ian.curso.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
