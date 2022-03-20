package com.ian.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ian.curso.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
