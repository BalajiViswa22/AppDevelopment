package com.example.demo.service;


import java.util.List;

import com.example.demo.entity.LoginEntity;


public interface LoginInt
{
   public List<LoginEntity>getLogin();
   public List<LoginEntity> getAll(int id);
   public void saveLogin(LoginEntity le);
   public void updateLogin(LoginEntity le);
   public void deleteLogin(int id);
   
}