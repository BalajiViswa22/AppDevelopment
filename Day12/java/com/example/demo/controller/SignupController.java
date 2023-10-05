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

import com.example.demo.entity.SignupEntity;
import com.example.demo.service.SignupService;
@CrossOrigin("*")
@RestController
public class SignupController 
{
	@Autowired
    private SignupService signupservice;
    @GetMapping("/signupget")
    public List<SignupEntity>getSign()
    {
    	return signupservice.getDetails();
    }
    
    @GetMapping("/signupget1")
	public List<SignupEntity> getAllDetails(@RequestParam String username,@RequestParam String email)
	{
		return signupservice.getAll(username, email);
	}
    
    @PostMapping("/signuppost")
    public void saveDetails(@RequestBody SignupEntity signupentity)
    {
    	signupservice.saveSignup(signupentity);
    }
    
    @PutMapping("/signupput")
    public void updateDetails(@RequestBody SignupEntity signupentity,@RequestParam String username)
    {
    	signupentity.setUsername(username);
    	signupservice.updateSignup(signupentity);
    }
    
  @DeleteMapping("/signupdelete")
  public void deleteDetails(@RequestParam String username)
  {
	  signupservice.deleteSignup(username);
  }
}