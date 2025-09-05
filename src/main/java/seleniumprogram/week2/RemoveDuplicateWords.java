package seleniumprogram.week2;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		 int count = 0;
		String[] name = text.split(" ");
		for (int i = 0; i < name.length - 1; i++) {
			for (int j = i + 1; j < name.length - 1; j++) {
//				System.out.println(name[i] + " " + name[j]);
				if (name[i].equals(name[j])) {
//					System.out.println(name[j] + "is dulicate");
					name[j] = " ";
					count ++;
				}
			}
		}
//		System.out.println(Arrays.toString(name));
		if (count>1) {
			
			String output = "";
			for (String val : name) {
			output += " "+val;	
			}
			System.out.println(output);
		}
		
		
	}
}