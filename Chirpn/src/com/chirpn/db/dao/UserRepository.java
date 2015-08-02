package com.chirpn.db.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.chirpn.core.user.UserProfile;;

@Repository
public interface UserRepository extends MongoRepository<UserProfile, String> {

	public UserProfile findById(int id);
	
}
