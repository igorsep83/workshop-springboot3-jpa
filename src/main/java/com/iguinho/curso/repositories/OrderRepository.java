package com.iguinho.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iguinho.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
