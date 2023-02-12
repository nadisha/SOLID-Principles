package com.nadisha.isp.correct;

public class Client {

	public static void main(String[] args) {
//		FacebookService facebook = new FacebookService();
//		InstagramService instagram = new InstagramService();
//		WhatsAppService whatsapp = new WhatsAppService();
//		
//		facebook.chat();
//		facebook.publishPost();
//		facebook.sendPhotos();
//		facebook.groupCall("Jane", "Simon");
//		
//		instagram.chat();
//		instagram.publishPost();
//		instagram.sendPhotos();
//		
//		whatsapp.chat();
//		whatsapp.sendPhotos();
//		whatsapp.groupCall("Jane", "Simon");
		
		
		SocialMediaService f1 = new FacebookService();
		f1.chat();
		f1.sendPhotos();
		
		SocialMediaPostService f2 = new FacebookService();
		f2.publishPost();
		
		SocialMediaPostService i = new InstagramService();
		i.publishPost();
	}

}
