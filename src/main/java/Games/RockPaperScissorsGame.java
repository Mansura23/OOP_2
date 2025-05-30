package Games;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock", "paper", "scissors"};
        String is_continue = "";
        do {
            System.out.print("Enter your move (rock, paper, scissors): ");
            String playerChoice = sc.nextLine().toLowerCase();
            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid respond. Please try again.");
                continue;
            }
            String computerchoice = choices[random.nextInt(3)];
            System.out.println("Computer: " + computerchoice);
            if (playerChoice.equals(computerchoice)) {
                System.out.println("It's a tie!");
            } else if (playerChoice.equals("rock") && computerchoice.equals("scissors") ||
                    playerChoice.equals("scissors") && computerchoice.equals("paper") ||
                    playerChoice.equals("paper") && computerchoice.equals("rock")) {
                System.out.println("You win!");

            } else {
                System.out.println("You lose!");
            }

            System.out.println("Do you want to play again? (y/n)");
            is_continue = sc.nextLine().toLowerCase();


        } while (is_continue.equals("yes"));

        System.out.println("Game over!");
        sc.close();

    }

}
