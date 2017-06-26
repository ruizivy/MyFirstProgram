package com.npc.game;
import com.npc.game.engine.GameEngine;


public class MyProgram {

	public static void main(String args[]) {
	
		Person p = new Person( "John" , "Doe", 20);
		p.PrintPersonDetails();
		
		Person p1 = new Person( "Susan" , "Tayo", 30);
		p1.PrintPersonDetails();
		
	}
}
