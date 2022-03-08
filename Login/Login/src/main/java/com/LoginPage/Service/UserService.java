package com.LoginPage.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LoginPage.Dto.LoginDto;
import com.LoginPage.Dto.LoginResponseDto;
import com.LoginPage.Repository.UserRepository;
import com.LoginPage.User.User;

@Service
public class UserService {


@Autowired

UserRepository ur;



public LoginResponseDto login (LoginDto loginDto) {



LoginResponseDto loginResponseDto = new LoginResponseDto();

String username = loginDto.getUsername();

String password = loginDto.getPassword();



User user =ur.findByUsername(username);



if(user==null) {

loginResponseDto.setStatus("404");

loginResponseDto.setMessage("User Not Found");

return loginResponseDto;

}



String passwordFromDB = user.getPassword();

if(password.equals(passwordFromDB)) {

loginResponseDto.setStatus("200");

loginResponseDto.setMessage("Authorized");

}

else if(!password.equals(passwordFromDB)) {

loginResponseDto.setStatus("401");

loginResponseDto.setMessage("Unauthorized");

}

else {

loginResponseDto.setStatus("500");

loginResponseDto.setMessage("Internal Server Error");

}



return loginResponseDto;

}





}

	
	

