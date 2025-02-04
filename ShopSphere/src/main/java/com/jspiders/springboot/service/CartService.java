package com.jspiders.springboot.service;

import org.springframework.stereotype.Service;

import com.jspiders.springboot.entity.Cart;
import com.jspiders.springboot.repository.CartRepository;

@Service
public class CartService {
    private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public Cart saveCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public Cart updateCart(Long id, Cart cart) {
        cart.setId(id);
        return cartRepository.save(cart);
    }

    public void deleteCart(Long id) {
        cartRepository.deleteById(id);
    }

    public void clearCart(Long id) {
        Cart cart = cartRepository.findById(id).orElseThrow();
        cart.getProducts().clear();
        cart.setTotalPrice(0);
        cartRepository.save(cart);
    }
}
