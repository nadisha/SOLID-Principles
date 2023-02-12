package com.nadisha.isp.correct;

//InstagramService is a substitute of SocialMediaService and SocialMediaPostService
public class InstagramService implements SocialMediaService, SocialMediaPostService{

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

}
