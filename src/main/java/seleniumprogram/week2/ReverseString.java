package seleniumprogram.week2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Nagajothi";
		char[] charArray = s.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.println(charArray[i]);

		}
		
		for (int i = 0; i <= charArray.length - 1; i++) {
			System.out.println(charArray[i]);

		}

	}

}
