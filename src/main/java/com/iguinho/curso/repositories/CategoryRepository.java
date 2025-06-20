package com.iguinho.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iguinho.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
