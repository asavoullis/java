/* Rock Paper Scissors  GAME */

import java.util.Scanner;

// Main class
class Main {
	//Main method
	public static void main(String[] args) {
		//Create a new Scanner which i will use to get  the input from the User
		Scanner in = new Scanner(System.in);
		

    //initialize a 2 variables to count the score 1 for the user and 1 for the computer
      int PlayerCount;
      int PcCount;
      //se the count variable to zero
	  PlayerCount = 0;
      PcCount = 0;
      

    //main game loop
		while(true) {

        
      //Print instructions
      System.out.println("Enter your move. Type in r for rock, p for paper or s for scissors. If you want to exit the game, type q: ");
      
      //print in the same line 
      System.out.printf("Your move: ");
      //Initialize the User's move
      String myMove = in.nextLine();
      
      //Check if the User wants to exit the game
      if (myMove.equals("q")){
		//print a new empty line
        System.out.println("");
		
		
		//Check to see if the user has won more games than the user lost, or lost more games than the user won, or if they were equal
		if( PlayerCount> PcCount){
			System.out.println("congratulations! You Won more games than you Lost! ");
		} else if( PlayerCount> PcCount){
			System.out.println("You Lost more games than you Won :( . ");
		} else{
			System.out.println("You are Tied! ");
		}
		
        System.out.println("Thanks for Playing!");
        break;
      }
      
      // .equals for strings 
      // == for ints
      
      //Verify that the User's move is valid
      // if myMove doesn't equal rock/paper/scissors
      if(!myMove.equals("r") && !myMove.equals("s") && !myMove.equals("p")) {
        //print its invlaid
        System.out.println("Your Move isn't valid!");
      }else {
      
        //Randomly generate the opponents move (0, 1, 2)
        int rand = (int)(Math.random() * 3);
        
        //initialize the computer's move variable as opponentMove and set it to an empty String 
        String opponentMove = "";
        
        //if the random number is equal to 0 then set the opponentMove varaible equal to rock
        if (rand == 0) {
          opponentMove = "r";
        
        ////if the random number is equal to 1 then set the opponentMove varaible equal to paper
        } else if (rand == 1) {
          opponentMove = "p";
          
        //ELSE - OR if the random number is equal to 2 then set the opponentMove varaible equal to scissors
        } else {
          opponentMove = "s";
        }
        //print the computer's move - using string concatination
        System.out.println("Opponent Move: " + opponentMove);
        
        
        //Calculate if the user / lost / tied
        
        //if user's move is the same as the computers 
        if( myMove.equals(opponentMove)){
          System.out.println("You Tied!");

          //Print the scores
          System.out.println("The Score Player Vs Computer is: " + PlayerCount + "-"+ PcCount +".\n");
          
        }
        // WIN CONDITIONS by the user
        //if the user's move is rock and the computer's move is scissors 
        //OR if the user's move is scissors and the computer's move is paper 
        //OR if the user's move is paper and the computer's move is rock
        else if((myMove.equals("r") && opponentMove.equals("s")) || (myMove.equals("s") && opponentMove.equals("p")) || (myMove.equals("r") && opponentMove.equals("s"))){
          //incriment the score of the player
          PlayerCount ++;
          //print You Win!
          System.out.println("You Win!");

          //Print the scores
          System.out.println("The Score Player Vs Computer is: " + PlayerCount + "-"+ PcCount +".\n");

        }else{
          //Incriment the score of the computer
          PcCount ++;
          //Print You Lose!
          System.out.println("You Lose!");

          //Print the scores
          System.out.println("The Score Player Vs Computer is: " + PlayerCount + "-"+ PcCount +".\n");    
        }
      }
    }
  }
}
