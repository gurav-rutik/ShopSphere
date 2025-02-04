package com.jspiders.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jspiders.springboot.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
	
}
