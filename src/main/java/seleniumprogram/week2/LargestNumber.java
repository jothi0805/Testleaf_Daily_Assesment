package seleniumprogram.week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {
		int[] num = { 3, 2, 11, 4, 6, 7 };
		List<Integer> List = new ArrayList<Integer>();
		for (Integer name : num) {
			List.add(name);
		}
		Collections.sort(List);
		System.out.println(List.get(List.size() - 2));
	}

}
