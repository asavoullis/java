/* Rock Paper Scissors  GAME */

import java.util.Scanner;

// Main class
class Main {
	//Main method
	public static void main(String[] args) {
		//Create a new Scanner which i will use to get  the input from the User
		Scanner in = new Scanner(System.in);
		
    //main game loop
		while(true) {

        
      //Print instructions
      System.out.println("Enter your move. Type in r for rock, p for paper or s for scissors. If you want to exit the game, type q: ");
      
      //print in the same line 
      System.out.print("Your move: ");
      //Initialize the User's move
      String myMove = in.nextLine();
      
      //Check if the User wants to exit the game
      if (myMove.equals("q")){
        System.out.println("");
        System.out.println("Thanks for Playing!");
        break;
      }

      //initialize a count variable to count the score 
      //positive = user is winning 
      int count;
      //se the count variable to zero
      count = 0;
      
      // .equals for strings 
      // == for ints
      
      //Verify that the User's move is valid
      // if myMove doesn't equal rock/paper/scissors
      if(!myMove.equals("r") && !myMove.equals("s") && !myMove.equals("p")) {
        //print its invlaid
        System.out.println("Your move isn't valid!");
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
        System.out.println("Opponent move: " + opponentMove);
        
        
        //Calculate if the user / lost / tied
        
        //if user's move is the same as the computers 
        if( myMove.equals(opponentMove)){
          System.out.println("You Tied!");

          //Print the count and new line 
          System.out.println("The score is " + count);
        }
        // WIN CONDITIONS by the user
        //if the user's move is rock and the computer's move is scissors 
        //OR if the user's move is scissors and the computer's move is paper 
        //OR if the user's move is paper and the computer's move is rock
        else if((myMove.equals("r") && opponentMove.equals("s")) || (myMove.equals("s") && opponentMove.equals("p")) || (myMove.equals("r") && opponentMove.equals("s"))){
          //incriment the score
          count ++;
          //print You Win!
          System.out.println("You Win!");

          //Print the count and new line 
          System.out.println("The score is " + count);
          System.out.println("");
        }else{//decrese the count 
          count --;
          //Print You Lose!
          System.out.println("You Lose!");

          //Print the score and new line
          System.out.println("The score is " + count);
          System.out.println("");
        
        }
      }
    }
  }
}
