package com.example.demo.service;

import com.example.demo.entity.FeedbackEntity;

import java.util.List;
import java.util.Optional;

public interface FeedbackService {
    List<FeedbackEntity> getAllFeedbacks();
    Optional<FeedbackEntity> getFeedbackById(Long feedbackId);
    List<FeedbackEntity> getFeedbacksByEmail(String email);
    FeedbackEntity createFeedback(FeedbackEntity feedbackEntity);
    FeedbackEntity updateFeedback(Long id, FeedbackEntity feedbackEntity);
    void deleteFeedback(Long id);
	
}
