import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String Rock = "Rock";
    private static final String Paper = "Paper";
    private static final String Scissors = "Scissors";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");

        String playerMove = scanner.next();

        if (playerMove.equals("r") || playerMove.equals("rock") || playerMove.equals("R") || playerMove.equals("Rock") || playerMove.equals("ROCK")) {
            playerMove = Rock;
        } else if (playerMove.equals("p") || playerMove.equals("paper") || playerMove.equals("P") || playerMove.equals("Paper") || playerMove.equals("PAPER")) {
            playerMove = Paper;
        } else if (playerMove.equals("s") || playerMove.equals("scissors") || playerMove.equals("S") || playerMove.equals("Scissors") || playerMove.equals("SCISSORS")) {
            playerMove = Scissors;
        } else {
            System.out.println("Invalid input. Try again...");
            return;
        }

        Random random = new Random();
        int computerRandomNumber = random.nextInt(4);

        String computerMove = "";

        switch (computerRandomNumber) {

            case 1:
                computerMove = Rock;
                break;
            case 2:
                computerMove = Scissors;
                break;
            case 3:
                computerMove = Paper;
                break;

        }

        System.out.printf("The computer choice: %s.%n", computerMove);

        if (playerMove.equals(Rock) && computerMove.equals(Rock) || playerMove.equals(Scissors) && computerMove.equals(Scissors)
                || playerMove.equals(Paper) && computerMove.equals(Paper)) {
            System.out.println("Draw!!!");
        }
        if (playerMove.equals(Rock) && computerMove.equals(Paper) || playerMove.equals(Scissors) &&
                computerMove.equals(Rock) || playerMove.equals(Paper) && computerMove.equals(Scissors)) {
            System.out.println("Computer Win!");
        }
        if (playerMove.equals(Rock) && computerMove.equals(Scissors) || playerMove.equals(Scissors) &&
                computerMove.equals(Paper) || playerMove.equals(Paper) && computerMove.equals(Rock)) {
            System.out.println("You Win!");
        }


    }
}