/**
 * @author andrianoff
 * @version June 25, 2014
 */

/**
 * Modified by: Muhammad Ibrahim
 **/

public class Dice
{
	private int sides;
	//Constructs a die
	public Dice(int s) //changes side number of the dice
	{
		sides = s;
	}

	/**
	 * Returns a String representation of a dice
	 * @return String representation of a dice
	 **/
	public String toString(){return "sides = " + sides;}

	//Rolls a number based on the number of sides on the die
	public int roll()    
	{
		return (int) (Math.random()*sides) + 1;
	}

}