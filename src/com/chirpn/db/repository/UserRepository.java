package com.chirpn.db.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chirpn.core.user.UserProfile;

@Repository
public interface UserRepository extends CrudRepository<UserProfile, String> {

	public UserProfile findById(int id);
	public List<UserProfile> findByGender(String gender);
	
}
