package com.divyendu.designPatterns.models;

public class Car {

	private int speed;
	private String model;
	
	public Car(int speed, String model) {
		this.speed = speed;
		this.model = model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	
}
