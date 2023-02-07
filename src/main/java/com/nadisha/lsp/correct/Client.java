package com.nadisha.lsp.correct;

public class Client {

	public static void main(String[] args) {
		FacebookService facebook = new FacebookService();
		InstagramService instagram = new InstagramService();
		WhatsAppService whatsapp = new WhatsAppService();
		
		facebook.chat();
		facebook.publishPost();
		facebook.sendPhotos();
		facebook.groupCall("Jane", "Simon");
		
		instagram.chat();
		instagram.publishPost();
		instagram.sendPhotos();
		
		whatsapp.chat();
		whatsapp.sendPhotos();
		whatsapp.groupCall("Jane", "Simon");
	}

}
