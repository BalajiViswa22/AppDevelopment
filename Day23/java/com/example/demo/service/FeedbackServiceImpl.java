package com.example.demo.service;

import com.example.demo.entity.FeedbackEntity;
import com.example.demo.respository.FeedbackRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    private final FeedbackRepo feedbackRepository;

    @Autowired
    public FeedbackServiceImpl(FeedbackRepo feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    @Override
    public List<FeedbackEntity> getAllFeedbacks() {
        return feedbackRepository.findAll();
    }

    @Override
    public Optional<FeedbackEntity> getFeedbackById(Long feedbackId) {
        return feedbackRepository.findById(feedbackId);
    }

    @Override
    public List<FeedbackEntity> getFeedbacksByEmail(String email) {
        return feedbackRepository.findByEmail(email);
    }

    @Override
    public FeedbackEntity createFeedback(FeedbackEntity feedbackEntity) {
        return feedbackRepository.save(feedbackEntity);
    }

    @Override
    public FeedbackEntity updateFeedback(Long feedbackId, FeedbackEntity feedbackEntity) {
        if (feedbackRepository.existsById(feedbackId)) {
            feedbackEntity.setId(feedbackId);
            return feedbackRepository.save(feedbackEntity);
        }
        return null; // Handle error, feedback not found
    }

    @Override
    public void deleteFeedback(Long feedbackId) {
        feedbackRepository.deleteById(feedbackId);
    }
}
