package week9Lab5;

// import week9Lab4.Dice;


public class RollADice 
{

	public static void main(String[] args) 
	{
		Dice firstDice = new Dice();
		Dice secondDice = new Dice();
		int countRolls = 0;
		int total1;
		int total2;
		int noDice;
		
		do
		{
			// firstDice.Throw(); // Roll the first pair of dice.
			total1 = firstDice.dice1 + firstDice.dice2;
			System.out.println("First pair comes up " + total1 + ".");
			
			// secondDice.Throw(); // Roll the second pair of dice.
			total2 = secondDice.dice1 + secondDice.dice2;
			System.out.println("Second pair comes up " + total2 + ".");

			noDice = Dice.OneDice(); // Roll the second pair of dice.
			System.out.println("The single dice comes up " + noDice + ".");
			
			countRolls++;
			
			System.out.println(); // Blank line.
			
		} while (total1 != total2);
		
		System.out.println("It took " + countRolls +
				" rolls until the totals were the same.");
		
	} // class main()
} // end class RollTwoDice
