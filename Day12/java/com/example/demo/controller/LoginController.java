package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.LoginEntity;
import com.example.demo.service.LoginService;
@RestController
@CrossOrigin("*")
public class LoginController 
{
	@Autowired
    private LoginService loginservice;
    @GetMapping("/loginget")
    public List<LoginEntity>getLoginDetailoginservice1()
    {
    	return loginservice.getLogin();
    }
    
    @GetMapping("/loginget1")
	public List<LoginEntity> getAllDetailoginservice(@RequestParam int id)
	{
		return loginservice.getAll(id);
	}
    @PostMapping("/loginpost")
    public void saveDetailoginservice(@RequestBody LoginEntity le)
    {
    	loginservice.saveLogin(le);
    }
    
    @PutMapping("/loginput")
    public void updateDetailoginservice(@RequestBody LoginEntity le,@RequestParam int id)
    {
    	le.setId(id);
    	loginservice.updateLogin(le);
    }
    
    @DeleteMapping("/logindelete")
    public void deleteDetailoginservice(@RequestParam int id)
    {
    	loginservice.deleteLogin(id);
    }
}