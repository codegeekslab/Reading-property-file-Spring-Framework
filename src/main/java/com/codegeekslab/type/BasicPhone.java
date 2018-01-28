package com.codegeekslab.type;

import com.codegeekslab.device.Phone;

public class BasicPhone implements Phone {

	public void openApp(int number, String app) {
		System.out.println("calling via " + app + " " + number);
	}

}
