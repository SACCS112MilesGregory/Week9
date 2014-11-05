package week9Lab3;

public class Dice 
{
	final static boolean DEBUG = true;
	public int dice1; // Number showing on the first dice.
	public int dice2; // Number showing on the second dice.
	boolean even;
	
	public Dice(int dice1, int dice2, boolean even)
	{
		
		this.even = even;
		// Constructor. Rolls the dice to initially show a random value.
		Throw(dice1, dice2); // Call the roll() method to roll the dice.
	}
	public int Value(int val1, int val2)
	{
		return dice1 + dice2; // Assign values 
	}
	
	public int Throw(int dice1, int dice2)
	{
			// Roll the dice by setting each of the dice to be
			// a random number between 1 and 6.
		dice1 = (int)(Math.random() * 6) + 1;
		dice2 = (int)(Math.random() * 6) + 1;
		return dice1 + dice2;
	}
} // end class Dice
