package number_guesser;

import java.util.Random;
import java.util.Scanner;

public class Number_Guesser {

    // Instance variables
    private int answer;
    // Initialise the scanner for user input Scanner sc = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Number_Guesser game = new Number_Guesser();
        game.playGame();

    }

    public void playGame() {

        // Initialise the random answer 
        Random r = new Random();
        answer = r.nextInt(99) + 1;

        int numGuesses;
        boolean gameOver = false;
        int userGuess;
        numGuesses = 0;

        // *** The main game loop start ***
        while (gameOver == false) {

            userGuess = getGuessFromUser();
            analyseGuess(userGuess);
            numGuesses++;

            if (numGuesses > 10) {
                System.out.println("Out of guesses!");
                System.out.println("The answer was " + answer);
                gameOver = true;

            } else if (answer == userGuess) {
                gameOver = true;
            }
        }
        // *** The main game loop end ***
    }

    private int getGuessFromUser() {
        
        int x;
        System.out.println("Enter your guess: ");
        x = sc.nextInt(); // Fetches an int from the console 
        return x;

    }

    private void analyseGuess(int guess) {

        if (guess > answer) {
            System.out.println("Too high");

        } else if (guess < answer) {

            System.out.println("Too low");

        } else {
            System.out.println("Well done!");
        }
    }

}
