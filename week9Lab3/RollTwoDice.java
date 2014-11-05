package week9Lab3;

import week9Lab1.Dice;


public class RollTwoDice 
{

	public static void main(String[] args) 
	{
		Dice firstDice = new Dice();
		Dice secondDice = new Dice();
		int countRolls = 0;
		int total1;
		int total2;
		
		do
		{
			firstDice.Throw(); // Roll the first pair of dice.
			total1 = firstDice.dice1 + firstDice.dice2;
			System.out.println("First pair comes up " + total1 + ".");
			
			secondDice.Throw(); // Roll the second pair of dice.
			total2 = secondDice.dice1 + secondDice.dice2;
			System.out.println("Second pair comes up " + total2 + ".");
			
			countRolls++;
			
			System.out.println(); // Blank line.
			
		} while (total1 != total2);
		
		System.out.println("It took " + countRolls +
				" rolls until the totals were the same.");
		
	} // class main()
} // end class RollTwoDice
