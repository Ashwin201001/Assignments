package com.exam;

public class ConnectXPLatform {
	 
	public static void main(String[] args) {
		
		System.out.println("StreamingService:");
		DigitalService streamingService = new StreamingService();
		streamingService.login("Sam", "sam123");
        streamingService.accessContent("Content1");
        streamingService.updateProfile(" Profile has been Updated");
        streamingService.logout();	
        
        System.out.println();
        
        System.out.println("CloudStorageService:");
		DigitalService cloudStorageService = new CloudStorageService();
		cloudStorageService.login("Roshan","roshan234");
		streamingService.accessContent("Content2");
        streamingService.updateProfile(" Profile has been Updated");
        streamingService.logout();		
        
        System.out.println("SocialStorageService:");
        DigitalService socialMediaService = new SocialMediaService();
        socialMediaService.login("Dinesh","dinesh345");
        socialMediaService.accessContent("Content3");
        socialMediaService.updateProfile(" Profile has been Updated");
        socialMediaService.logout();
		
		
		
	}
 
}