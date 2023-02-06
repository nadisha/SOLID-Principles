package com.nadisha.ocp.correct;

public class EmailNotificationService implements NotificationService {

	@Override
	public void sendOTP(String to) {
		System.out.println("Send email with OTP number to email address " + to);		
	}

}
