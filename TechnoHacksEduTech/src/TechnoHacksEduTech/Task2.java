package TechnoHacksEduTech;

import java.util.Random;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		int round = 10, guess, count = 1;
        Scanner S1 = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Welcome to the Number Guessing Game. The System will generate a Random Number between 1-100");
        System.out.println("You have to guess the Random Number. \nYour Score will be based on the Number of attempts you take to guess the right number");
        int randomNumber = 1 + r.nextInt(100);
        System.out.println("The Random number has been created by the System");

        for (int i = 1; i <= round; i++) {

            System.out.println("Round " + i + " begins now...");

            System.out.println("Enter your guess Number " + count + ": ");
            guess = S1.nextInt();
            if (guess > randomNumber) {
                System.out.println("The number " + guess + " is higher than the generated number. Guess Again...");
            } else if (guess < randomNumber) {
                System.out.println("The number " + guess + " is lower than the generated number. Guess Again...");
            } else {
                System.out.println("The number " + guess + " is equal to the random number that was created by the System. \n Congratulations it took you " + count + " attempts.");
                break; 
            }
            count++;
        }
        System.out.println("\nAll the Rounds are now over.\nThank you for Playing the Game.\nHope you enjoyed!");
        S1.close();
    }


	}


