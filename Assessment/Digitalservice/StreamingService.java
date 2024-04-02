package com.exam;

public class StreamingService implements DigitalService {
	 
	@Override
	public void login(String username, String password) {
		 System.out.println("Login with username: " + username);
	}
 
	@Override
	public void logout() {
		System.out.println("Logging Out!");
		
	}
 
	@Override
	public void accessContent(String content) {
		System.out.println("Accessing content: " + content);
		
	}
 
	@Override
	public void updateProfile(String updateinfo) {
		System.out.println("Updating profile: " + updateinfo);
		
	}
 
}
 