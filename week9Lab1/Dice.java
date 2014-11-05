package week9Lab1;

public class Dice 
{
	public int dice1; // Number showing on the first dice.
	public int dice2; // Number showing on the second dice.
	
	public Dice()
	{
		// Constructor. Rolls the dice to initially show a random value.
		Throw(); // Call the roll() method to roll the dice.
	}
	public int Value()
	{
		return dice1 + dice2; // Assign values
	}
	
	public int Throw()
	{
			// Roll the dice by setting each of the dice to be
			// a random number between 1 and 6.
		dice1 = (int)(Math.random() * 6) + 1;
		dice2 = (int)(Math.random() * 6) + 1;
		return dice1 + dice2;
	}
} // end class Dice
