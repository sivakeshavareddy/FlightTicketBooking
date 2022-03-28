package com.kingflyer;

	import static org.junit.jupiter.api.Assertions.assertEquals;
	import static org.mockito.Mockito.when;



	import org.junit.jupiter.api.Test;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.test.context.SpringBootTest;
	import org.springframework.boot.test.mock.mockito.MockBean;

import com.kingflyer.flightbooking.Repo.UserRepo;
import com.kingflyer.flightbooking.entity.User;
import com.kingflyer.flightbooking.service.UserService;




	/*@RunWith(SpringRunner.class)*/
	@SpringBootTest
	public class UserTest {



	@MockBean
	private UserRepo repository;
	@Autowired
	private UserService service;


	@Test
	public void getuser() {
	User user = new User(2642, "rama2266@gmail.com"	,"ram",	"keshava",	"2266",	"jack"	,2642);
	when(repository.save(user)).thenReturn(user);
	assertEquals(user, service.addUser(user));
	}



 }
