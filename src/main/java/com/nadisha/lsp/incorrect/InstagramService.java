package com.nadisha.lsp.incorrect;

//InstagramService is not a substitute of SocialMediaService
public class InstagramService extends SocialMediaService {

	@Override
	public void chat() {
		System.out.println("Instagram can use to chat");
	}

	@Override
	public void publishPost() {
		System.out.println("Instagram can use to publish posts");	
	}

	@Override
	public void sendPhotos() {
		System.out.println("Instagram can use to store photos");	
	}

	@Override
	public void groupCall(String... users) {
		// Not Supported
	}

}
