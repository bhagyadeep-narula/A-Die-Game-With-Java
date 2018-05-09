/**
 * Assignment 3
 *
 * Date: 05-04-2018
 *
 * Full Name: Bhagyadeep Narula
 *
 * Course Section: CST8110_303 Intro To Computer Programming
 *
 * Lab Teacher: Jason Mombourquette
 *
 * Program Purpose: This problem will simulate a dice betting game. .
 *
 **/

import java.util.Random;

public class Die { // This class models a single die
	
	private int dieValue ;
	private Random randomNumbers;
	
	
	public Die() {
		dieValue = 0;
		randomNumbers = new Random();
	}
	
	public void rollDie() {
		dieValue = (randomNumbers.nextInt(6) + 1);
	}
	
	public void displayDie() {
		rollDie();
		System.out.print(dieValue);
	}
	
	public int getValue() {
		return dieValue;
	}
	
	
}
