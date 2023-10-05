package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.LoginEntity;
import com.example.demo.repository.LoginRepo;


@Service
public class LoginService implements LoginInt 
{
	@Autowired
    private LoginRepo loginrepo;
   @Override
   public List<LoginEntity> getLogin() 
   {
	  return loginrepo.findAll();
   }
   @Override
   public void saveLogin(LoginEntity le)
   {
	  loginrepo.save(le);
   }
   @Override
   public void updateLogin(LoginEntity le) 
   {
	   loginrepo.save(le);
   }
   @Override
   public void deleteLogin(int id) 
   {
	  loginrepo.deleteById(id);
   }
   @Override
   public List<LoginEntity> getAll(int id) 
   {
	  return loginrepo.getAll(id);
   }
}