package com.codegeekslab.app;

import com.codegeekslab.device.CellPhone;

public class CallingApp {

	private CellPhone phone;

	private int number;

	private String app;

	// for setter injection
	public void setPhone(CellPhone phone) {
		this.phone = phone;
	}

	public CellPhone getPhone() {
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

	public void dialNumber() {
		phone.makeCall(number, app);
	}

}
