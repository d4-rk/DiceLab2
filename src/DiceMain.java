/**
 * @author andrianoff
 * @version June 25, 2014
 */

/**
 * Modified by: Muhammad Ibrahim
 * 2nd Dice Lab
 * 12 September 2020
 * EXTRA: Add a third die with a different number of sides and include the sum of that
 **/
public class DiceMain
{
	public static void main(String[] args)
	{
		//create dice that will be rolled in the program
		Dice d1 = new Dice(6);
		Dice d2 = new Dice(6);
		Dice d3 = new Dice(4);
		int rolls = 0, sum, s3 = 0, s4 = 0, s5 = 0, s6 = 0, s7 = 0, s8 = 0, s9 = 0, s10 = 0,
				s11 = 0, s12 = 0, s13 = 0, s14 = 0, s15 = 0, s16 = 0;
		for(int i = 0; i<10000; i++){
			int d1roll = d1.roll(), d2roll = d2.roll(), d3roll = d3.roll(); //integers that hold the value of the rolls
			sum = d1roll + d2roll + d3roll;
			//add to the variables based on the result
			if (sum == 3) s3++;
			else if (sum == 4) s4++;
			else if (sum == 5) s5++;
			else if (sum == 6) s6++;
			else if (sum == 7) s7++;
			else if (sum == 8) s8++;
			else if (sum == 9) s9++;
			else if (sum == 10) s10++;
			else if (sum == 11) s11++;
			else if (sum == 12) s12++;
			else if (sum == 13) s13++;
			else if (sum == 14) s14++;
			else if (sum == 15) s15++;
			else if (sum == 16) s16++;

			rolls++;
		}
		//print information about the rolls
		System.out.println("Number of Rolls: " + rolls + "\n");
		System.out.println("Rolls of 3: " + s3);
		System.out.println("Rolls of 4: " + s4);
		System.out.println("Rolls of 5: " + s5);
		System.out.println("Rolls of 6: " + s6);
		System.out.println("Rolls of 7: " + s7);
		System.out.println("Rolls of 8: " + s8);
		System.out.println("Rolls of 9: " + s9);
		System.out.println("Rolls of 10: " + s10);
		System.out.println("Rolls of 11: " + s11);
		System.out.println("Rolls of 12: " + s12);
		System.out.println("Rolls of 13: " + s13);
		System.out.println("Rolls of 14: " + s14);
		System.out.println("Rolls of 15: " + s15);
		System.out.println("Rolls of 16: " + s16);
	}
}

