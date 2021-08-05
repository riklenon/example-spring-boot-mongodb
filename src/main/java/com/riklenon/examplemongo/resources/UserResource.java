package com.riklenon.examplemongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.riklenon.examplemongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User neymar = new User("1", "Neymar", "neymar@email.com");
		User ronaldo = new User("2", "Ronaldo", "ronaldo@email.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(neymar, ronaldo));
		return ResponseEntity.ok().body(list);
	}
}
