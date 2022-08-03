/*


    // Rock Paper Scissors Game - 

        General Instructions:

        -Program should validate all user input.
        -Game should ask the user to play again and continue if yes and stop if no.
        -Once the user stops playing, program should print the total number of wins.
        -Once complete, upload your java file.


        "HOW TO PLAY ROCK PAPER SCISSORS": In the game Rock Paper Scissors, two players simultaneously choose one
        of the three options;
            rock,
            paper, or
            scissors
        If both players choose the same option, then the result is a tie. However,
        if they choose differently, the winner is determined as follows:
            -Rock beats scissors, because a rock can break a pair of scissors.
            -Scissors beats paper, because scissors can cut paper.
            -Paper beats rock, because a piece of paper can cover a rock.

       

 

*/

package projects;
import java.util.*;
import java.io.*;

public class RockPaperScissors 
{
    public static void main(String[] args)
  {
        Scanner player = new Scanner(System.in);
            int playerOneScore = 0;
            int computerScore = 0;
        do
        {
            System.out.println("Enter \"1\" for Rock, \"2\" for Paper, \"3\" for Scissors.");
            //VALIDATE PLAYER'S MOVE.
        while(!player.hasNextInt())
        { 
            System.out.println("Invalid Play. Please Try again.");
            player.next();
        }
        //
        int playerGuess = player.nextInt();
        if(playerGuess == 1)
        {
            System.out.println("Your Move: " + (playerGuess) + " for Rock");
            
        }
        else if(playerGuess == 2)
        {
            System.out.println("Your Move: " + (playerGuess) + " for Paper");
            
        }
        else if(playerGuess == 3)
        {
            System.out.println("Your Move: " + (playerGuess) + " for Scissors");
            
        }
        else if(playerGuess > 3)
        {
            System.out.println("DEFAULT PLAY - Please Enter \"1\" for Rock, \"2\" for Paper, \"3\" for Scissors.");
        }
        //RANDOMIZE COMPUTER'S CHOICE
        Random game = new Random();
        int cpu = game.nextInt(3) + 1;
        String computer = "";
        if(cpu == 1)
        {
            computer = "(1) rock";
            
        }
        else if(cpu == 2)
        {
            computer = "(2) paper";
            
        }
        else if(cpu == 3)
        {
            computer = "(3) scissors";
            
        }
        System.out.println("CPU move: " + computer);
        //Determine Winner Of Game
        if(playerGuess == cpu)
        {
            System.out.println("TIE GAME!");
        }
        else if((playerGuess == 1) && (cpu == 3) || (playerGuess == 3) && (cpu == 2) || (playerGuess == 2) && (cpu == 1))
        {
            System.out.println("YOU WIN!");
            playerOneScore++;

        }
        else
        {
            System.out.println("YOU LOST!");
            computerScore++;
        }
        System.out.println("Would you like to play again? Type Yes or No");
        
    }  //KEEP PLAYING OR CLOSE OUT THE GAME AND PRINT RESULTS.
        while(player.next().equalsIgnoreCase("yes"));
    System.out.println("YOU'VE WON " + playerOneScore + " GAMES.");
    System.out.print("Thank You For Playing!");
     
  } 
    
}
