//Daneil Hall
//April 4 2017
//ITSE
//A short program that rolls dice and counts the "boxcars"


public class exercise16 {
    public static void main (String[] argStr) {
	
	
	PairOfDice dice = new PairOfDice();
	int boxcars = 0;                                // stores number of boxcars
	final int intRolls = 1000, intBoxes = 12; 

	
	for (int i = 0; i < intRolls; i++) { //rolls dice
	    if (dice.roll() == intBoxes) {
		boxcars++;
	    }
	}

	// output the results
	System.out.println ("Rolled " + intRolls + " pairs of dice with " + boxcars + " boxcars.");
    }
}
