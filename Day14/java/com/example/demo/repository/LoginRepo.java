package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;

import com.example.demo.entity.LoginEntity;
//@Repository
public interface LoginRepo extends JpaRepository<LoginEntity, Integer> 
{
	@Query(value="SELECT * FROM login WHERE id=:id",nativeQuery=true)
    public List<LoginEntity> getAll(int id);
}