/* Rock Paper Scissors  GAME */

import java.util.Scanner;

// Main class
class Main {
	//Main method
	public static void main(String[] args) {
	  //create a new Scanner which i will use to get  the input from the User
		Scanner in = new Scanner(System.in);
	  
    //initialize a count variable to count the score 
    //positive = user is winning 
    int count;
    count = 0;

	  //main game loop
		while(true) {
			//print a question RPS?
			System.out.print("Choose rps ");
		
			//Store what the user enters into this string variable called move
			String move = in.nextLine();
		  
			//Make a variable called cMove where we will have the choice of the computer stored in - the choise is random
			String cMove = Character.toString("rps".charAt ((int)(Math.random()*3)));
		
			//Print out the computers move
			System.out.println("Computer chooses: " + cMove);
	
			//if user's move is the same as the computers
			if(move.equals(cMove)) {
        //Print It's a Tie
				System.out.println("It's a Tie");
        //prints the score
        System.out.println("The score is " + count);
        //print an empty line
        System.out.println("");
		
			// WIN CONDITIONS by the user
			//if the user's move is rock and the computer's move is scissors 
			//OR if the user's move is sciscors and the computer's move is paper 
			//OR if the user's move is paper and the computer's move is rock
			}else if 
        ((move.equals("r") && cMove.equals("s")) || (move.equals("s") && cMove.equals("p")) || (move.equals("r") && cMove.equals("s"))){
        //incriment the score
        count ++;
        //print You Win!
			  System.out.println("You Win!");

        //Print the count and new line
        System.out.println("The score is " + count);
        System.out.println("");

      } else {
        //decrese the count 
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
