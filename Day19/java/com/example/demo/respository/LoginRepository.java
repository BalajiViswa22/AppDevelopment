package com.example.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Login;
@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {

}