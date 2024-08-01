package com.digistore.controller;

import com.digistore.model.Cart;
import com.digistore.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping
    public ResponseEntity<Cart> getCartByUserId(@RequestParam String userId) {
        return ResponseEntity.ok(cartService.getCartByUserId(userId));
    }

    @PostMapping
    public ResponseEntity<Cart> updateCart(@RequestBody Cart cart) {
        return ResponseEntity.ok(cartService.updateCart(cart));
    }
}

