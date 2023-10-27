package com.flight_reservation_app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flight_reservation_app.entities.user;
import com.flight_reservation_app.repositories.userRepository;

@Controller
public class userController {
	@Autowired
	 userRepository useRepo;
	@RequestMapping("/ShowLogingPage")
	public String showLoginPage() {
		return"login/login";
	}
	
	@RequestMapping("/ShowReg")
	public String ShowReg() {
		return"login/ShowReg";
	}
	@RequestMapping("/saveReg")
	public  String saveReg(@ModelAttribute("using") user using) {
		useRepo.save(using);
		return"login/login";
	}

}
