
public class Dice 
{
	private int numDice;	//Keeps track of the number of dice to roll
	final int low = 1; //Tracks the lower bound
	final int high = 6; //Tracks the higher bound
	
	//Iinitializes the number of dice
	public Dice(int numDice)
	{
		this.numDice = numDice;
	}
	
	public void setNumDice(int numDice)
	{
		this.numDice = numDice;
	}
	
	public int getNumDice()
	{
		return numDice;
	}
	
	public int roll()
	{
		int total = 0;										//Keeps track of the total roll result
		RandomNumber rand = new RandomNumber(low, high);	//Our RandomNumber object to generate the dice results
		//Runs once for each dice to roll
		for(int i = 0; i < numDice; i++)
		{
			//"Rolls" a dice and adds that number to the running dice total
			total += rand.GetANumber();
		}
		return total;
	}

}
