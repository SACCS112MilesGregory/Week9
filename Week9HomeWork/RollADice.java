package Week9HomeWork;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class RollADice
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Dice dice;
		int wins = 0, losses = 0;
		do
		{
			System.out.print("Enter a number of dice: ");
			dice = new Dice(scan.nextInt(), false);
			
			System.out.print("Guess the value of the dice toss: ");
			int userInput = scan.nextInt();

			dice.Throw();
			
			if ( userInput == dice.Value() )
			{
				JOptionPane.showMessageDialog(null, "You guessed correctly");
				wins++;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "You guessed incorrectly, the value was: "
						+ dice.Value() + ".");
				losses++;
			}
			JOptionPane.showMessageDialog(null, "The dice have been thrown: " + wins+losses + " many times.");
			JOptionPane.showMessageDialog(null, "You have guessed correct " + wins + " many times.");
			JOptionPane.showMessageDialog(null, "You have guessed incorrectly " + losses + " many times");
			
			System.out.print("Wish to play again? [True/False]: ");
		} while (scan.nextBoolean());
	}
}