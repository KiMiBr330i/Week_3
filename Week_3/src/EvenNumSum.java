import java.util.Scanner;

public class EvenNumSum {

	public static void main(String[] args) {

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
		} else
			while (input < userinput) {
				input = input + 2;
				sum += input;
				

			}
		System.out.println("This is the sum of the even numbers: " + sum);

		user.close();
	}
}
