import java.util.Random;
import java.util.Scanner;

public class RPSGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] rps = {"rock", "paper", "scissor"};
            String computerMove = rps[new Random().nextInt(rps.length)];

            String playerMove;

            while(true) {
                System.out.println("Please enter your move (rock, paper, or scissor)");
                playerMove = scanner.nextLine();
                if (playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissor")) {
                    break;
                }
                System.out.println(playerMove + " is not a valid move.");
            }

            System.out.println("Computer played: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("The game was a tie!");
            }
            else if (playerMove.equals("rock")) {
                if (computerMove.equals("paper")) {
                    System.out.println("You lose!");

                } else if (computerMove.equals("scissor")) {
                    System.out.println("You win!");
                }
            }

            else if (playerMove.equals("paper")) {
                if (computerMove.equals("rock")) {
                    System.out.println("You win!");

                } else if (computerMove.equals("scissor")) {
                    System.out.println("You lose!");
                }
            }

            else if (playerMove.equals("scissor")) {
                if (computerMove.equals("paper")) {
                    System.out.println("You win!");

                } else if (computerMove.equals("rock")) {
                    System.out.println("You lose!");
                }
            }

            System.out.println("Play again? (y/n)");
            String playAgain = scanner.nextLine();

            if (!playAgain.equals("y")) {
                break;
            }
        }
        scanner.close();
    }
}
;