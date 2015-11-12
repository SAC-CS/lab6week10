
import java.util.Scanner;

public class DiceDriver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numdice =0;  // sets number of dice 
		int guess = 0;    // sets how many guess 
		int numCorrectGuesses = 0; // sets the number of correct guesses
		int numRolls = 0; // sets number of rolls 		  
		
			System.out.print("Enter Number of dice to Roll ");
			numdice = scan.nextInt();       // user inputs Number of dice to role
			Dice d = new Dice(numdice);     // Gets dice class roll
			
			System.out.println();
			
			d.setNumDice(numdice);               // initiates number of rolls 
			numRolls++;
			
			System.out.print("Guess the dice result: ");  // User inputs guess
			guess = scan.nextInt();
			
			if(guess == d.roll())                  // adds one to correct guess if correct guess
			{
				numCorrectGuesses++;                      
			}
			System.out.println("computer output was "+d.roll()+" yours was "+guess); // outputs computer input and user input
	
		System.out.println("You were correct "+((numCorrectGuesses/(double)numRolls)*100)+
				"% of the time and made "+numCorrectGuesses+" correct guesses");
		System.out.println("You were incorrect"+(((numRolls-numCorrectGuesses)/(double)numRolls)*100)
				+"% of the time and "+ "made "+(numRolls-numCorrectGuesses)+" Incorrect Guesses");
	
}

}
