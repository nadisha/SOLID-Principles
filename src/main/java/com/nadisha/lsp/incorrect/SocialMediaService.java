package com.nadisha.lsp.incorrect;

public abstract class SocialMediaService {
	
	// Support WhatsApp, Facebook and Instagram
	public abstract void chat();
	
	// Support Facebook and Instagram
	public abstract void publishPost();
	
	// Support WhatsApp, Facebook and Instagram
	public abstract void sendPhotos();
	
	// Support WhatsApp and Facebook
	public abstract void groupCall(String... users);
}
