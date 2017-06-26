package com.npc.game;

public class Person {

	private String fName;
	private String lName;
	private int Age;
	
	public Person(String f, String l, int a) {
		this.fName = f;
		this.lName = l;
		this.Age = a;
	}
	
	public void PrintPersonDetails() {
		System.out.println(this.fName + " " + this.lName + " " + this.Age);
	}
	
}
