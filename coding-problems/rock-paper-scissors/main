import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        //    private String game() {

        CPUchooses cpuChooses = new CPUchooses();
        User user = new User();
        String computerMove = cpuChooses.cpuChooses();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Welcome to Leyla's Rock Paper Scissors game! When you're ready, press Y/N");
            String userInput = user.userInput();
            userInput = (userInput.toLowerCase());

            if (userInput.equals("y")) {
                System.out.println("Great. " + "What is your move?");
            } else {
                System.out.println("go home");

            }
            userInput = scanner.nextLine();


            if (userInput.equals("rock") && computerMove.equals("rock")) {
                System.out.println("You have drawn!");
            } else if (userInput.equals("paper") && (computerMove.equals("paper"))) {

                System.out.println("You have drawn!");
            } else if (computerMove.equals("scissors") && (userInput.equals("scissors"))) {
                {
                    System.out.println("You have drawn!");
                }
                if (computerMove.equals("rock") && (userInput.equals("paper"))) {

                    System.out.println("You are a loser!");
                } else if (computerMove.equals("paper") && (userInput.equals("scissors")))
                    System.out.println("You are a loser!");
            } else if (computerMove.equals("scissors") && (userInput.equals("rock"))) {
                System.out.println("You are a loser!");

            }
            if (computerMove.equals("paper") && (userInput.equals("rock"))) {
                System.out.println("You have won!");
            } else if (computerMove.equals("rock") && (userInput.equals("scissors"))) {
                System.out.println("You have won!");
            } else if (computerMove.equals("scissors") && (userInput.equals("paper"))) {
                System.out.println("You have won!");
            } else {
                System.out.println("Please enter either rock, paper, or scissors");
            }

            System.out.println("Would you like to play again? (Y/N)");
            userInput = scanner.nextLine();

            if (userInput.equals("N")) {
                break;
            }
        }
    }

}
