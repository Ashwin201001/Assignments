package com.exam;

public interface DigitalService {
	
	public void login(String username, String password) ;
	
	public void logout();
	
	public void accessContent(String content);
	
	public void updateProfile(String updateinfo);
 
}