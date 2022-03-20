package com.ian.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ian.curso.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
