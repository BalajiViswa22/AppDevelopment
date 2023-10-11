package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.SignupEntity;
import com.example.demo.repository.SignupRepo;

@Service
public  class SignupService implements SignupInt 
{
   
    @Autowired
    private SignupRepo signuprepository;
	@Override
	public List<SignupEntity> getDetails() {
		
		return signuprepository.findAll();
	}

    @Override
    public void saveSignup(SignupEntity signupentity) 
    {
    	signuprepository.save(signupentity);
	
    }

   @Override
   public void updateSignup(SignupEntity signupentity) 
   {
	   signuprepository.save(signupentity);
	
   }

   @Override
   public void deleteSignup(String username) 
   {
	   signuprepository.deleteByUsername(username);
   }

@Override
public List<SignupEntity> getAll(String username, String email) {
	
	return signuprepository.getAll(username, email);
}



}