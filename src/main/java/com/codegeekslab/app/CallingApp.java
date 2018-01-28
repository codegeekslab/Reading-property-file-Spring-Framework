package com.codegeekslab.app;

import com.codegeekslab.device.Phone;

public class CallingApp {

	private Phone phone;

	private int number;

	private String app;

	public CallingApp(Phone phone, int number, String app) {
		super();
		this.phone = phone;
		this.number = number;
		this.app = app;
	}

	// for setter injection
	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public Phone getPhone() {
		return phone;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public void makeCall() {
		phone.openApp(number, app);
	}

}
