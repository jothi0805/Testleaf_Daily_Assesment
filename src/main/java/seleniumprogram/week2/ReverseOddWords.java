package seleniumprogram.week2;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String test = "I am a software tester";
		String[] words = test.split(" ");
		char[] charArray = null;
		String response = "";
		for (int i = 0; i < words.length; i++) {
			
			if(i % 2 == 1)  {
				String oddVal = "";
				//System.out.println(words[i]);
				charArray = words[i].toCharArray();
				for (int j = charArray.length - 1; j >= 0; j--) {
					//System.out.println(charArray[j]);
					oddVal += charArray[j];
				}
				response += " "+oddVal;
			}else {
				response += " "+words[i];
			}

		}
		System.out.println(response);
		}
}
