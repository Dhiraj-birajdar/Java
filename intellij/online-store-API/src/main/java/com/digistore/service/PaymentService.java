package com.digistore.service;

import com.digistore.model.Payment;
import com.digistore.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment processPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    public double getTotalPayments() {
        return paymentRepository.findAll()
                .stream()
                .mapToDouble(Payment::getAmount)
                .sum();
    }
}