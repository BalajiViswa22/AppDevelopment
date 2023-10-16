package com.example.demo.respository;

import com.example.demo.entity.FeedbackEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedbackRepo extends JpaRepository<FeedbackEntity, Long> {
    List<FeedbackEntity> findByEmail(String email);

	boolean existsById(Long feedbackId);
}
