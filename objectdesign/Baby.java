package com.objectdesign;

public class Baby extends Person {
	String name = null;//
	String eyeColor = null;//
	double weight = 0.0d;//
	double height = 0.0d;//
	int howManyFeet;//
	int howManyHands;//
	int howManyEyes;//
	int howManyEyeBrows;//
	int howManyToeNails;//
	int howManyNostrils; //
	
	public Baby()
	{
		
	}

	public Baby(String name, String eyeColor, double weight, double height, int howManyFeet, int howManyHands,
			int howManyEyes, int howManyEyeBrows, int howManyToeNails, int howManyNostrils) {
		this.name = name;
		this.eyeColor = eyeColor;
		this.weight = weight;
		this.height = height;
		this.howManyFeet = howManyFeet;
		this.howManyHands = howManyHands;
		this.howManyEyes = howManyEyes;
		this.howManyEyeBrows = howManyEyeBrows;
		this.howManyToeNails = howManyToeNails;
		this.howManyNostrils = howManyNostrils;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getHowManyFeet() {
		return howManyFeet;
	}

	public void setHowManyFeet(int howManyFeet) {
		this.howManyFeet = howManyFeet;
	}

	public int getHowManyHands() {
		return howManyHands;
	}

	public void setHowManyHands(int howManyHands) {
		this.howManyHands = howManyHands;
	}

	public int getHowManyEyes() {
		return howManyEyes;
	}

	public void setHowManyEyes(int howManyEyes) {
		this.howManyEyes = howManyEyes;
	}

	public int getHowManyEyeBrows() {
		return howManyEyeBrows;
	}

	public void setHowManyEyeBrows(int howManyEyeBrows) {
		this.howManyEyeBrows = howManyEyeBrows;
	}

	public int getHowManyToeNails() {
		return howManyToeNails;
	}

	public void setHowManyToeNails(int howManyToeNails) {
		this.howManyToeNails = howManyToeNails;
	}

	public int getHowManyNostrils() {
		return howManyNostrils;
	}

	public void setHowManyNostrils(int howManyNostrils) {
		this.howManyNostrils = howManyNostrils;
	}

	@Override
	public String toString() {
		return "You are looking for a baby with the name " + name + ", and eye color " + eyeColor + ", with weight " + weight + ", and height " + height
				+ ", and " + howManyFeet + " feet(foot), " + howManyHands + " hand(s), " + howManyEyes
				+ " eyes, " + howManyEyeBrows + " eye brow(s), " + howManyToeNails + " toe nail(s), "
				+ howManyNostrils + " nostril(s)";
	}

	@Override
	public void sleeps() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eats() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void snores() {
		// TODO Auto-generated method stub
		
	}

	
	

	
	
}