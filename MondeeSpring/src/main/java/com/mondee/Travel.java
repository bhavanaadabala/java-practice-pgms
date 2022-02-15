package com.mondee;

public class Travel implements Journey{

	Vehicle v;
	public void setV(Vehicle v) {
		this.v = v;
	}
	public void startJourney() {
		System.out.println("Starting journey");
		v.move();
		
	}

}
