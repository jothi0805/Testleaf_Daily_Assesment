package seleniumprogram.week2;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "changeme";
		char[] charArray = test.toCharArray();
		String output="";
		for (int i = 0; i < charArray.length; i++)

		{
			if (i % 2 == 1) {
				output +=String.valueOf(charArray[i]).toUpperCase();
				//System.out.println(String.valueOf(charArray[i]).toUpperCase());
			} else {
				output +=charArray[i];
				//System.out.println(charArray[i]);
			}
		}
		System.out.println(output);
	}

}
