package com.usermanagement.dto;

import lombok.Data;

@Data
public class UserDto {
	
	private String username;
	private String email;
	private String phoneNumber;
	private String password;
	private String confirmPassword;
	private String role;
	


}
