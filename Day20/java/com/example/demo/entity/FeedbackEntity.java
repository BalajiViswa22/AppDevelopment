package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FeedbackEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="feedback")
    private String feedback;
    @Column(name="email")
    private String email;

    // Constructors, getters, and setters

    public FeedbackEntity() {
    }

    public FeedbackEntity(String feedback, String email) {
        this.feedback = feedback;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "FeedbackEntity{" +
                "id=" + id +
                ", feedback='" + feedback + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
