/**
 * 
 */
package collection;

/**
 * write a description
 * 
 * @author KathrynIrving
 * @version 2.1.2023_951
 */
public class PiggyBank {
	
	
	public static void main(String[] args) {
	COSC600_P1_PiggyBank.test();
	}
	
	private int numPennies;
	private int numNickels;
	private int numDimes;
	private int numQuarters;

	public PiggyBank()

	{
		numPennies = 0;
		numNickels = 0;
		numDimes = 0;
		numQuarters = 0;
	}
	
	
    /**Adds the specified amount (numPenniesToAdd) to the PiggyBank's
     * numPennies **/
	public void addPennies(int numPenniesToAdd) {
		if (numPenniesToAdd > 0) {
			numPennies = numPennies + numPenniesToAdd;
		}
	}

	public void addNickels(int numNickelsToAdd) {
		if (numNickelsToAdd > 0) {
			numNickels = numNickels + numNickelsToAdd;
		}
	}

	public void addDimes(int numDimesToAdd) {
		if (numDimes > 0) {
			numDimes = numDimes + numDimesToAdd;
		}
	}

	public void addQuarters(int numQuartersToAdd) {
		if (numQuarters > 0) {
			numQuarters = numQuarters + numQuartersToAdd;
		}
	}
//returns dollar amount 
	public float getContents() {
		float dollarAmount = (float) 0.00;
		dollarAmount = dollarAmount + (float)numPennies / (float)100;
		dollarAmount = dollarAmount + (float)numNickels/(float)20;
		dollarAmount = dollarAmount + (float)numDimes / (float)10;
		dollarAmount = dollarAmount + (float)numQuarters / (float)4;
		return dollarAmount;
	}
	
//
	public float breakTheBank () {
		float dollarAmount = getContents();
		numPennies = 0;
		numNickels = 0;
		numDimes = 0;
		numQuarters = 0;
		return dollarAmount;
	}
	
}
