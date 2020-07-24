import java.util.Scanner;

public class EvenNumSum {

	public static void main(String[] args) {
		// TODO Design and implement an app that readsan integer value and printsthe sum
		// of all even integers between 2
		// and the input value inclusive. Print an error message if the value is less
		// than 2 and have the user enter the number.
		// Prompt accordingly.
		// 1. user input of an integer value: scanner, scan, nextInt()
		// 2. Count function: count +=2
		// 3. error value, <2 conditional statement
		// 4. sum of all even integers
		// 5. how to handle odd number inputs
		// 6. if the number is odd, subtract 1, and make the secondary integer.
		// 7. how to tell if a number is odd or even? if the remainder of a division by
		// 2 is not zero.
		Scanner user = new Scanner(System.in);
		int newinput, userinput, input = 0, sum = 0;
		System.out.println("This is the even number adder program.");
		System.out.println("Please input an integer greater than 2: ");
		userinput = user.nextInt();
		if (userinput < 2) {
			System.out.println("That is an invalid entry. Please try again: ");
		}
		if (userinput % 2 > 0) {
			newinput = (userinput - 1);
			while (input < newinput) {
				input = input + 2;
				sum += input;

			}
			// }

			// }
			// if (userinput % 2 != 0) {
			// newinput = (userinput + 0);
			// while (input <= userinput) {
			// input = input + 2;
			// sum += input;

		}
		System.out.println("This is the sum of the even numbers: " + sum);

	}
}
