package seleniumAutomation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingAssignment {

	public static void main(String[] args) {
		String[] name = { "HCL", "Wipro", "Aspire", "Systems", "CTS" };
		List<String> company = new ArrayList<String>();
		for (String each : name) {
			company.add(each);

		}
		Collections.sort(company);
		System.out.println(company);

		 //for(int i = 0; i=company.size()-1; i--) {
			 //System.out.println();
		 }
	}

