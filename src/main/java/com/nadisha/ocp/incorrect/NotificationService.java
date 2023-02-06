package com.nadisha.ocp.incorrect;

public class NotificationService {
	
	public void sendOTP(String medium, String to) {
		if (medium.equals("email")) {
			System.out.println("Send email with OTP number to email address " + to);
		}
		
		if (medium.equals("mobile")) {
			System.out.println("Send SMS with OTP number to mobile number " + to);
		}	
		
		// Have to modify, if the OTP is sent to whatsapp
	}
}
