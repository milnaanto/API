package com.LoginPage.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.LoginPage.Dto.LoginDto;
import com.LoginPage.Dto.LoginResponseDto;
import com.LoginPage.Service.UserService;

@Controller

public class UserController {
	@Autowired

	UserService us;



	@PostMapping(value = "/login", consumes = "application/json")

	public LoginResponseDto login(@RequestBody LoginDto loginDto) {


	return us.login(loginDto);
	

}
	
}  
