package com.nadisha.lsp.incorrect;

// FacebookService is a substitute of SocialMediaService
public class FacebookService extends SocialMediaService {

	@Override
	public void chat() {
		System.out.println("Facebook can use to chat");
	}

	@Override
	public void publishPost() {
		System.out.println("Facebook can use to publish posts");		
	}

	@Override
	public void sendPhotos() {
		System.out.println("Facebook can store photos");		
	}

	@Override
	public void groupCall(String... users) {
		System.out.println("Facebook can use to get group calls");		
	}

}
