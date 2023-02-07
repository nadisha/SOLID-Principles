package com.nadisha.lsp.incorrect;

public class Client {

	public static void main(String[] args) {
		SocialMediaService facebook = new FacebookService();
		SocialMediaService instagram = new InstagramService();
		SocialMediaService whatsapp = new WhatsAppService();

		facebook.chat();
		facebook.publishPost();
		facebook.sendPhotos();
		facebook.groupCall("Jane", "Simon");
		
		instagram.chat();
		instagram.publishPost();
		instagram.sendPhotos();
		instagram.groupCall("Jane", "Simon"); // not supported
		
		whatsapp.chat();
		whatsapp.publishPost(); // not supported
		whatsapp.sendPhotos();
		whatsapp.groupCall("Jane", "Simon");
	}

}
