package com.springAndAngularSeed.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springAndAngularSeed.domain.User;
import com.springAndAngularSeed.repository.UserRepository;

@RestController
@RequestMapping(value={"/api_v1/user"}, produces="application/json")
public class UserContoller {

	@Autowired UserRepository userRepository;
	
	@RequestMapping(method=RequestMethod.POST, consumes="application/json")
	public Map register(@RequestParam Map params){
		Map<String, Object> result=new HashMap<String, Object>();
		User newUser = new User();
		newUser.setName(params.get("name").toString());
		newUser.setUsername(params.get("username").toString());
		newUser.setPassword(params.get("password").toString());
		User user = userRepository.save( newUser);
		Map mapToReturn = new HashMap();
		if(user != null) {
			mapToReturn.put("success", true);
		}
		else {
			mapToReturn.put("success", false);
		}
		return mapToReturn;
	}
}
