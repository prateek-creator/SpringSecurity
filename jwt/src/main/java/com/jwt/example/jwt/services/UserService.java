package com.jwt.example.jwt.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import com.jwt.example.jwt.models.User;
@Service
public class UserService {
	private List<User> store=new ArrayList<>();
	UserService(){
		store.add(new User(UUID.randomUUID().toString(), "prateek","parteek@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "Deepu","Deepu@gmail.com"));
	}
	public List<User> getUser() {
		return this.store;
	}
	
}
