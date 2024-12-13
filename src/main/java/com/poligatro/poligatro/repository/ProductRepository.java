package com.poligatro.poligatro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poligatro.poligatro.models.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}
