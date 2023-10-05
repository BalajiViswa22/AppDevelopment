package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.example.demo.entity.SignupEntity;

@Repository
public interface SignupRepository extends JpaRepository<SignupEntity, Integer> 
{
	@Query(value="SELECT * FROM signup WHERE username=:username and email=:email",nativeQuery=true)
    public List<SignupEntity> getAll(String username,String email);

	public void deleteByUsername(String username);
}