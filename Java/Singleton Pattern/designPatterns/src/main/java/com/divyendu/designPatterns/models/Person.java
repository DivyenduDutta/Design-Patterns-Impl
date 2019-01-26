package com.divyendu.designPatterns.models;

public class Person {
	private int id;
	private String name;
	
	public Person() {
		System.out.println("Person instantiated!!");
	}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Person:"+this.id+" - "+this.name;
	}
	
}
