package InbuiltRandomClass;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int targetNumber = random.nextInt(upperBound - lowerBound);
        
        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I have chosen a number between " + lowerBound + " and " + upperBound + ". Try to guess it.");
        
        int count = 0;
        int guess;
        
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            count++;
            
            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            }
        } while (guess != targetNumber);
        
        System.out.println("Congratulations! You've guessed the number " + targetNumber + " in " + count + " guesses.");
        
        scanner.close();
    
	}

}
