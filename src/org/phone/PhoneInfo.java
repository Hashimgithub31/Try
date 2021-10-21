package org.phone;

public class PhoneInfo {
	
	private void phoneName() {
		System.out.println("phone name is Redmi");
	}
	
	private void phoneImeinum() {
		System.out.println("phone Imei num is 36523565323");
	}
	
	private void camera() {
		System.out.println("camera is 48mp");
	}
	
	private void storage() {
		System.out.println("storage capacity is 256gb");
	
	}
	
	private void osName() {
		System.out.println("os type is lollipop");
		
		
	}
	
	private void imei() {
		System.out.println("imei number is valid");
	}
	
	public static void main(String[] args) {
		PhoneInfo p=new PhoneInfo();
		p.phoneName();
		p.phoneImeinum();
		p.camera();
		p.storage();
		p.osName();
		p.imei();
	}

}
