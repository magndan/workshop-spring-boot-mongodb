package com.magndan.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.magndan.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/Users")
public class UserResource {

	@RequestMapping(method=RequestMethod.GET) 
	public ResponseEntity<List<User>> findAll() {
		User maria = new User("1", "Maria Silva", "mariasilava@gmail.com");
		User daniel = new User("2", "Daniel Silva", "danielsilava@gmail.com");
		List<User> list = new ArrayList<User>();
		list.addAll(Arrays.asList(maria, daniel));
		return ResponseEntity.ok().body(list);
		
	}
	
}
