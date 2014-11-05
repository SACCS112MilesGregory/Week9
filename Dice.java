
import javax.swing.JOptionPane;

public class Dice 
{
	final static boolean DEBUG = true;
	int value = 0;
	int numOfDice = 1;
	static int numOfThrows = 0;
	boolean even;
	
	public Dice(int dice, boolean even)
	{
		this.even = even;
		numOfDice = (dice > 0) ? dice : 1;
	}
	
	public void Throw()
	{
		do
		{
			value = 0;
			for(int i = 0; i < numOfDice; i++)
			{
				int random = (int)(Math.random() * 6 +1);
				value += random;
				
				if(DEBUG)
					JOptionPane.showMessageDialog(null, random);
			}
			numOfThrows++;
		} while (!((even && Value() % 2 == 0) || (!even && Value() % 2 != 0)));
	}
	
	public int Value()
	{
		return value;
	}
	
	public int getNumOfThrows()
	{
		return numOfThrows;
	}
	
	public static int OneDice()
	{
		return (int)(Math.random() * 6);
	}
}
