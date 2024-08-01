package com.digistore.service;

import com.digistore.model.Cart;
import com.digistore.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public Cart getCartByUserId(String userId) {
        return cartRepository.findByUserId(userId);
    }

    public Cart updateCart(Cart cart) {
        return cartRepository.save(cart);
    }
}