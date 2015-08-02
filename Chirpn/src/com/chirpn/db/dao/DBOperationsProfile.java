package com.chirpn.db.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

import com.chirpn.core.user.UserProfile;

public class DBOperationsProfile {
	
	ApplicationContext ctx;
	MongoOperations mongoOperation;

	public DBOperationsProfile(){
		ctx = new GenericXmlApplicationContext("spring-config.xml");
		mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
		
	}
	
	public UserProfile findProfileById(int id){
		return mongoOperation.findById(id, UserProfile.class);
	}
	
	public void saveProfile(UserProfile userProfile){
		mongoOperation.save(userProfile);
	}
	
	public List<UserProfile> findAllProfile(){
		return mongoOperation.findAll(UserProfile.class);
	}
	
	
}
