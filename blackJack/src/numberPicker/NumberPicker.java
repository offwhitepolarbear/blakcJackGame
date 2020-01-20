package numberPicker;

import java.util.ArrayList;

public class NumberPicker {
	
	public static int randomNumberPicker(int range) {
		int pick = 0;
		pick = (int) (Math.random() * range);
		return pick;
	}
	
	public static boolean isAlreadyPickedNumber(int pick, ArrayList<Integer> alredyNumberList) {
		boolean isAlreadyPicked = false;
		for (int alreadyNumbering : alredyNumberList) {
			if (pick == alreadyNumbering) {
				isAlreadyPicked=true;
				break;
			}
		}
		return isAlreadyPicked;
	}

}
