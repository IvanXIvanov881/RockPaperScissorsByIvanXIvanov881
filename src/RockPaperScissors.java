import java.util.Scanner;

public class RockPaperScissors {
    private static final String Rock = "Rock";
    private static final String Paper = "Paper";
    private static final String Scissors = "Scissors";
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose [r]ock, [p]aper or [s]cissors");

        String playerMove = scanner.nextLine();

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


    }
}


