package com.digistore.controller;

import com.digistore.model.Payment;
import com.digistore.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public ResponseEntity<Payment> processPayment(@RequestBody Payment payment) {
        return ResponseEntity.ok(paymentService.processPayment(payment));
    }

    @GetMapping("/total")
    public ResponseEntity<Double> getTotalPayments() {
        return ResponseEntity.ok(paymentService.getTotalPayments());
    }
}

