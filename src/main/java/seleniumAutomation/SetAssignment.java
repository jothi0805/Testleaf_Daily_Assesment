package seleniumAutomation;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetAssignment {

	public static void main(String[] args) {
		String CompanyName = "google";
		char[] charArray = CompanyName.toCharArray();
		Set<Character> unique = new LinkedHashSet<Character>();

		for (int i = 0; i < charArray.length; i++) {
			unique.add(charArray[i]);

		}

		System.out.println(unique);
	}

}
