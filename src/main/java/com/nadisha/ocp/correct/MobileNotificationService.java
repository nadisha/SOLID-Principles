package com.nadisha.ocp.correct;

public class MobileNotificationService implements NotificationService {

	@Override
	public void sendOTP(String to) {
		System.out.println("Send SMS with OTP number to mobile number " + to);
	}

}
