package MoreExerciseDataTypesAndVariables;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random randomNumber = new Random();
        int computerNumber = randomNumber.nextInt(100);

        boolean correct = false;
        while (!correct) {
            System.out.print("Guess a number (1-100): ");
            String playerInput = scanner.nextLine();
            int playerNumber = Integer.parseInt(playerInput);

            if (playerNumber > computerNumber) {
                if (playerNumber > 100) {
                    System.out.println("Invalid Input.");
                } else {
                    System.out.println("Too High");
                }
            } else if (playerNumber < computerNumber) {
                if (playerNumber < 1) {
                    System.out.println("Invalid Input.");
                } else {
                    System.out.println("Too Low");
                }
            } else {
                System.out.println("You guessed it!");
                correct = true;
            }
        }
    }
}

