package com.chirpn.core.user;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

import com.chirpn.db.dao.DBOperationsProfile;


public class TestClass {
	
	public static void main(String[] args) {
/*		ApplicationContext ctx = new GenericXmlApplicationContext("spring-config.xml");
		MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");*/
		
		DBOperationsProfile dbOps = new DBOperationsProfile();
		
		UserProfile userProfile = new UserProfile();
		userProfile.setId(4);
		userProfile.setGender("testing");
		
		dbOps.saveProfile(userProfile);
		
		List<UserProfile> profileList = dbOps.findAllProfile();
		
		for(UserProfile currentProfile : profileList ){
			System.out.println("Gender " + currentProfile.getGender());
			System.out.println("Id " + currentProfile.getId());
		}
		
		System.out.println(dbOps.findProfileById(3).getGender());
		
		
	}
}
