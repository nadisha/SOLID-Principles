package com.nadisha.lsp.incorrect;

//WhatsAppService is not a substitute of SocialMediaService
public class WhatsAppService extends SocialMediaService {

	@Override
	public void chat() {
		System.out.println("WhatsApp can use to chat");
	}

	@Override
	public void publishPost() {
		// Not Supported		
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
