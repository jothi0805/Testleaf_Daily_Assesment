package seleniumAutomation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IntersectionList {

	public static void main(String[] args) {
		int[] num1 = { 3, 2, 11, 4, 6, 7 };
		int[] num2 = { 1, 2, 8, 4, 9, 7 };

		List<Integer> list = new ArrayList<Integer>();
		for (Integer value : num1) {
			list.add(value);

		}
		List<Integer> list1 = new ArrayList<Integer>();
		for (Integer value : num2) {
			list1.add(value);
		}
		for (Integer name : list) {
			for (Integer name1 : list1) {
				if (name == name1) {
					System.out.println("This is an intersection number" + name1);
				}

			}
		}

	}

}
