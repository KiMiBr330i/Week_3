//**********************************************************************************************************
// AgeGuessCond.java  Lab 3 Exercise 1  Kip. B.  07/21/20	CPSC 50100-002
// 
// Third Modified AgeGuess Program with conditional statements and loop.
//
//**********************************************************************************************************

import java.util.Random;
import java.util.Scanner;

public class AgeGuessCond {

	public static void main(String[] args) {

		// Name
		// Guess---------------------------------------------------------------------

		Scanner scan = new Scanner(System.in);

		System.out.print("Guess what my name is: ");
		String name;
		name = scan.nextLine();

		System.out.println("You guessed that my name is: " + name + ". It's actually 3279.64i0.");

		// Age
		// Guess---------------------------------------------------------------------

		int AgeGuess, age;
		Random Age = new Random();
		age = 1 + Age.nextInt(10);

		System.out.print("I'm somewhere between 0 and 10 days old. Guess a number: ");
		AgeGuess = scan.nextInt();

		while (AgeGuess != age) {
			System.out.println("You guessed wrong! Guess again: ");
			AgeGuess = scan.nextInt();
		}

		if (AgeGuess == age) {
			System.out.println("Good guess!");

		}
		System.out.println("I'm actually " + age + " days old.");

		scan.close();

	}
}
