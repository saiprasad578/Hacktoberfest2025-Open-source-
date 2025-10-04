import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] choices = {"rock", "paper", "scissors"};
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int playerScore = 0, computerScore = 0;

        while (playerScore < 3 && computerScore < 3) {
            System.out.print("Enter rock, paper, or scissors: ");
            String playerChoice = sc.next().toLowerCase();
            String computerChoice = choices[rand.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("Draw");
            } else if (
                (playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                (playerChoice.equals("scissors") && computerChoice.equals("paper"))
            ) {
                System.out.println("You win this round");
                playerScore++;
            } else if (
                playerChoice.equals("rock") ||
                playerChoice.equals("paper") ||
                playerChoice.equals("scissors")
            ) {
                System.out.println("Computer wins this round");
                computerScore++;
            } else {
                System.out.println("Invalid input");
            }

            System.out.println("Score => You: " + playerScore + " | Computer: " + computerScore);
            System.out.println();
        }

        if (playerScore == 3) {
            System.out.println("You won the game!");
        } else {
            System.out.println("Computer won the game!");
        }

        sc.close();
    }
}
