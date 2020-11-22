package Main;
import javafx.print.PageLayout;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Do you want to play?(y/n)");
        String playing = in.nextLine();

        while(playing.toLowerCase().equals("y")){
            System.out.println("What does the player want to play? [Rock - R, Paper - P, Scissors - S]");
            String playerString = in.nextLine();
            int playerChoice = playerChoice(playerString);

            if(playerChoice == -1) {
                badInput();
                continue;
            }

            checkWin(playerChoice, computerChoice());

            System.out.println("Do you want to play again? (y/n)");
            playing = in.nextLine();
        }

        System.out.println("Thanks for your time");
    }

    public static int computerChoice(){
        int compChoice = (int)(Math.random()*3) + 1;

        switch (compChoice){
            case 1:
                System.out.println("Computer plays rock!");
                break;
            case 2:
                System.out.println("Computer plays scissors!");
                break;
            case 3:
                System.out.println("Computer plays paper!");
                break;
            default:
                break;
        }

        return compChoice;
    }

    public static int playerChoice(String in){
        switch (in.toUpperCase()){
            case "R":
                System.out.println("Player plays rock!");
                return 1;
            case "S":
                System.out.println("Player plays scissors!");
                return 2;
            case "P":
                System.out.println("Player plays paper!");
                return 3;
            default:
                break;
        }

        return -1;
    }

    public static void badInput(){
        System.out.println("The player's input is invalid!");
        System.out.println("Game is resetting ... 3 ");
        System.out.println("... 2 ");
        System.out.println("... 1 ... Done!");
    }

    public static void checkWin(int player, int computer){
        if(player == computer){
            System.out.println("It is a draw!");
        }

        else if (player == 1 && computer == 3){
            System.out.println("Unfortunately, player has lost. :(");
        }

        else if (player == 2 && computer == 1){
            System.out.println("Unfortunately, player has lost. :(");
        }

        else if (player == 3 && computer == 2){
            System.out.println("Unfortunately, player has lost. :(");
        }

        else {
            System.out.println("Yay! You have won!! ... (Updating my algorithm)");
        }
    }
}
