package seleniumAutomation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 10, 6, 8 };
		List<Integer> number = new ArrayList<Integer>();
		for (Integer each : num) {
			number.add(each);

		}
		Collections.sort(number);
		System.out.println(number);

	
	//for(int i=1; i=number.size()+1; i++) {
		

}
}