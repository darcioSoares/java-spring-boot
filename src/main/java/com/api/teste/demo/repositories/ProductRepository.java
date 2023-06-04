package com.api.teste.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.teste.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
