package com.iguinho.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iguinho.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
