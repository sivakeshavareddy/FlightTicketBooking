package com.kingflyer.flightbooking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired ;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kingflyer.flightbooking.Exception.ResourceNotFoundException;
import com.kingflyer.flightbooking.entity.User;
import com.kingflyer.flightbooking.service.UserService;

@RestController
@RequestMapping("/User")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/addUser")
	public void addUser(@RequestBody User user) throws Exception
	{
		userService.addUser(user);
	}
	
	@GetMapping("/getUser/{email}")
	public User getUser(@PathVariable("email") String email)
	{ 
		return userService.getUser(email);
	}
	
	@PutMapping("/modifyUser")
	public void modifyUser(@RequestBody User user)
	{
		userService.modifyUser(user);
	}
	
	@GetMapping("/checkLoginByemailandpassword/{email}/{password}")
	public ResponseEntity<String> checkLogin(@PathVariable("email") String email,@PathVariable("password") String password)

				public <email> ResponseEntity<String> checkLoginByemailandpassword( email password) {
				String status = null;
				Optional<String> obj = userService.checkLoginandpassword(email.passsword);
				if (obj.isPresent()) {
					userService.checkLoginByemailandpassword();
				status = "Successfully Updated";
				}else {
				throw new ResourceNotFoundException("Given id it's not available in db..");
				}


				}
	
		