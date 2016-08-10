package com.objectdesign;

import java.util.Scanner;

public class BabyPlace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userInputB = null;
		int feature = 0;
		boolean userFailed = false;
		
		Baby aBaby = new Baby();

		
			System.out.println("Welcome to the Baby place!");
			
			do {
				System.out.println("What name would you like?");
				 userInputB = sc.nextLine();

				//userFailed = numberIsValid(userInputB);

			} while (userFailed);
			
			//feature = Integer.parseInt(userInputB);
			
			aBaby.setName(userInputB);
			
			do {
				userFailed = false;
				
				System.out.println("What weight would you like?");
				userInputB = sc.nextLine();
				
				 userFailed = doubleIsValid(userInputB);
				
				
			} while (userFailed);

			
			double feature2 = Double.parseDouble(userInputB);
			
			aBaby.setWeight(feature2);
			
			do {
				System.out.println("What eye color would you like?");
				 userInputB = sc.nextLine();

				

			} while (userFailed);
			
			//feature = Integer.parseInt(userInputB);
			
			aBaby.setEyeColor(userInputB);
			
		do {
			System.out.println("How many toe nails would you like?");
			 userInputB = sc.nextLine();

			userFailed = numberIsValid(userInputB);

		} while (userFailed);
		
		feature = Integer.parseInt(userInputB);
		
		aBaby.setHowManyToeNails(feature);
		
		do {
			userFailed = false;
			
			System.out.println("How many nostrils would you like?");
			userInputB = sc.nextLine();
			
			 userFailed = numberIsValid(userInputB);
			
			
		} while (userFailed);

		
		feature = Integer.parseInt(userInputB);
		
		aBaby.setHowManyNostrils(feature);
		
		do {
			userFailed = false;
			
			System.out.println("What height would you like?");
			userInputB = sc.nextLine();
			
			 userFailed = doubleIsValid(userInputB);
			
			
		} while (userFailed);

		
		double feature1 = Double.parseDouble(userInputB);
		
		aBaby.setHeight(feature1);
		
		do {
			userFailed = false;
			
			System.out.println("How many eyes would you like?");
			userInputB = sc.nextLine();
			
			 userFailed = numberIsValid(userInputB);
			
			
		} while (userFailed);

		
		feature = Integer.parseInt(userInputB);
		
		aBaby.setHowManyEyes(feature);
		
		do {
			userFailed = false;
			
			System.out.println("How many hands would you like?");
			userInputB = sc.nextLine();
			
			 userFailed = numberIsValid(userInputB);
			
			
		} while (userFailed);

		
		feature = Integer.parseInt(userInputB);
		
		aBaby.setHowManyHands(feature);
		
		do {
			userFailed = false;
			
			System.out.println("How many eye brows would you like?");
			userInputB = sc.nextLine();
			
			 userFailed = numberIsValid(userInputB);
			
			
		} while (userFailed);

		
		feature = Integer.parseInt(userInputB);
		
		aBaby.setHowManyEyeBrows(feature);
		
		do {
			userFailed = false;
			
			System.out.println("How many feet would you like?");
			userInputB = sc.nextLine();
			
			 userFailed = numberIsValid(userInputB);
			
			
		} while (userFailed);

		
		feature = Integer.parseInt(userInputB);
		
		aBaby.setHowManyFeet(feature);
		
		System.out.println(aBaby.toString());
		System.out.println("We have one in stock for you!");
		
	} // main
	
	
	
	public static boolean numberIsValid(String someStringToMakeANumber) {

		try {
			int aNumber = Integer.parseInt(someStringToMakeANumber);
			return false;
			
		} catch (NumberFormatException e) {
			return true;
		}

	}
	
	public static boolean doubleIsValid(String someStringToMakeANumber) {

		try {
			double aNumber = Double.parseDouble(someStringToMakeANumber);
			return false;
			
		} catch (NumberFormatException e) {
			return true;
		}

	

}
}