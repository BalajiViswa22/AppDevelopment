package com.example.demo.service;

import com.example.demo.entity.PaymentEntity;
import com.example.demo.respository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;

    @Autowired
    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public List<PaymentEntity> getAllPayments() {
        return paymentRepository.findAll();
    }

    @Override
    public Optional<PaymentEntity> getPaymentById(Long id) {
        return paymentRepository.findById(id);
    }

    @Override
    public PaymentEntity createPayment(PaymentEntity paymentEntity) {
        return paymentRepository.save(paymentEntity);
    }

    @Override
    public PaymentEntity updatePayment(Long id, PaymentEntity paymentEntity) {
        if (paymentRepository.existsById(id)) {
            paymentEntity.setPaymentId(id);
            return paymentRepository.save(paymentEntity);
        }
        return null; 
    }

    @Override
    public void deletePayment(Long id) {
        paymentRepository.deleteById(id);
    }
}
