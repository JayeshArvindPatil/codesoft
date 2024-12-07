import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 1, max = 100;
        int randomNumber = (int) (Math.random() * (max - min + 1)) + min;
        int attempts = 0, maxAttempts = 5;
        boolean guessed = false;

        System.out.println("Guess a number between " + min + " and " + max);

        while (attempts < maxAttempts && !guessed) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                guessed = true;
            } else if (guess > randomNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }
        }

        if (!guessed) {
            System.out.println("Out of attempts! The number was: " + randomNumber);
        }
    }
}
