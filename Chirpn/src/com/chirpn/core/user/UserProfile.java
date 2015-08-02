package com.chirpn.core.user;
import org.springframework.data.annotation.Id;

public class UserProfile {
	@Id
	private int id;
	
	private String gender;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
