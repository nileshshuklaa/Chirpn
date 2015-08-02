package com.chirpn.core.user;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.chirpn.db.repository.UserRepository;


public class TestClass {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-config.xml");
		//MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
		
		UserRepository userRepo = ctx.getBean("userRepository", UserRepository.class);
		List<UserProfile> results = (List<UserProfile>) userRepo.findAll();
		for(UserProfile profile : results){
			//System.out.println("from repository : " + profile.getPhoneNumber());
			profile.setPhoneNumber(999999999);
			userRepo.save(profile);
		}
		
		results = (List<UserProfile>) userRepo.findByGender("female");
		for(UserProfile profile : results){
			System.out.println("from repository : " + profile.getGender());
			profile.setPhoneNumber(999999999);
		}
		
		UserProfile userProfile = new UserProfile();
		userProfile.setGender("female");
		userProfile.setDesignation("test designation# 2");
		userProfile.setAddress("Test address");
		userRepo.save(userProfile);
		
		
	}
}
