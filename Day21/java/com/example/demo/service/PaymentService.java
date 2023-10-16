package com.example.demo.service;

import com.example.demo.entity.PaymentEntity;
import java.util.List;
import java.util.Optional;

public interface PaymentService {
    List<PaymentEntity> getAllPayments();
    Optional<PaymentEntity> getPaymentById(Long id);
    PaymentEntity createPayment(PaymentEntity paymentEntity);
    PaymentEntity updatePayment(Long id, PaymentEntity paymentEntity);
    void deletePayment(Long id);
}
