package randonnumber;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Pick a number freom 1 through 10");

        Scanner scans = new Scanner(System.in);

        int numberGuess = 0,
                minimum = 1,
                maximum = 10,
                numGuessed = -1;

        int numToGuess = new Random().nextInt((maximum - minimum) + 1) + minimum;

        while (numberGuess != numToGuess) {

            try {
                numGuessed = Integer.parseInt(scans.nextLine());
            } catch (Exception e) {
                System.out.println("Type a number between 1 through 10: ");
                continue;
            }
            System.out.println("Number you Guessed:  " + numGuessed);

            if (numGuessed == numToGuess) {
                System.out.println("Good Job you guessed right!!!!!!");
            } else {
                String numberGuessed = (numGuessed > numToGuess) ? "Too big" : "Too small";
                System.out.println(numberGuessed + " you were wrong, try again");
            }

            numberGuess++;
        }

        boolean winningGuess = numberGuess == 1;

        System.out.println("You guessed " + numberGuess + " " + (winningGuess ? "time" : "times"));
    }

}