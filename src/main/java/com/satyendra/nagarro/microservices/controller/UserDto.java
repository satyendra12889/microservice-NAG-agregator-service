package com.satyendra.nagarro.microservices.controller;

public class UserDto {
	
	public String name;
	
	public String age;
	
	public String email;
	
	public UserDto(User u ) {
		
		name = u.name;
		age = u.address;
		email = u.email;
			
	}

}
