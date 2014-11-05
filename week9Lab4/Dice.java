package week9Lab4;

public class Dice 
{
	final static boolean DEBUG = true;
	public int dice1; // Number showing on the first dice.
	public int dice2; // Number showing on the second dice.
	static int dice;
	boolean even;

	public Dice()
	{
		// Constructor. Rolls the dice to initially show a random value.
		Throw(); // Call the Throw() method to roll the dice.
	}
	
	public Dice(int dice1, int dice2, boolean even)
	{
		
		this.even = even;
		// Constructor. Rolls the dice to initially show a random value.
		Throw(); // Call the Throw() method to roll the dice.
	}
	
	public int Value()
	{
		return dice1 + dice2;
	}
	
	public int  Throw()
	{
			// Roll the dice by setting each of the dice to be
			// a random number between 1 and 6.
		dice1 = (int)(Math.random() * 6) + 1;
		dice2 = (int)(Math.random() * 6) + 1;
		return dice1 + dice2;
	}
	
	public static int OneDice()
	{
		dice = (int)(Math.random() * 6) +1;
		return dice;
	}
} // end class Dice
