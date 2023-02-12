package com.nadisha.isp.correct;

//WhatsAppService is a substitute of SocialMediaService and SocialMediaCallService
public class WhatsAppService implements SocialMediaService, SocialMediaCallService{

	@Override
	public void chat() {
		System.out.println("WhatsApp can use to chat");
	}

	@Override
	public void sendPhotos() {
		System.out.println("WhatsApp use to send photos");
	}

	@Override
	public void groupCall(String... users) {
		System.out.println("WhatsApp can use to get group calls");	
	}

}
