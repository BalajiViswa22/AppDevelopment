package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.request.AuthenticationRequest;
import com.example.demo.dto.request.RegisterRequest;
import com.example.demo.dto.response.AuthenticationResponse;
import com.example.demo.service.AuthenticationService;

import lombok.RequiredArgsConstructor;



@RestController

@RequestMapping("/auth")	
@RequiredArgsConstructor
@CrossOrigin("*")
public class AuthenticationController {
	
	private final AuthenticationService aservice ;
	 @PostMapping("/authenticate")
	
	 public ResponseEntity<AuthenticationResponse> register(
		      @RequestBody RegisterRequest request
		  ) {
		aservice.register(request);
		    return ResponseEntity.ok(aservice.register(request));
		  }
	 @PostMapping("/register")
		  public ResponseEntity<String> authenticate(
		      @RequestBody AuthenticationRequest request
		  ) {
		    return ResponseEntity.ok("user registered");
		  }

}

