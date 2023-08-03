package lv.lasimani.hyperskill.bot;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleBot {
    private static LocalDate today = LocalDate.now();
    private static String botName = "Aid";
    private static int birthYear = today.getYear(); //

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        greetUser();
        guessAge(input);
        countToNumber(input);
        testProgrammingKnowledge(input);

        input.close();
    }

    private static void greetUser() {
        System.out.println("Hello! My name is " + botName);
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
        String userName = new Scanner(System.in).nextLine();
        System.out.println("What a great name you have, " + userName + "!");
    }

    private static void guessAge(Scanner input) {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5, and 7.");
        int remainder3 = input.nextInt();
        int remainder5 = input.nextInt();
        int remainder7 = input.nextInt();
        int ageGuess = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + ageGuess + "; that's a good time to start programming!");
    }

    private static void countToNumber(Scanner input) {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int anyNumber = input.nextInt();
        for (int i = 0; i <= anyNumber; i++) {
            System.out.println(i + "!");
        }
    }

    private static void testProgrammingKnowledge(Scanner input) {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        boolean running = true;
        while (running) {
            try {
                int userAnswer = input.nextInt();
                if (userAnswer == 2) {
                    System.out.println("Congratulations, have a nice day!");
                    break;
                } else {
                    System.out.println("Please, try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please, try again.");
                input.nextLine();
            }
        }
    }
}

