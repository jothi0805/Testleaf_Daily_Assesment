package Polymorphism;

public class MethodOverRiding extends MethodOverloading{
	public void reporStep(String msg, String status) {
		System.out.println(msg);
		System.out.println(status);

	}

	public static void main(String[] args) {
		MethodOverRiding over=new MethodOverRiding();
		over.reporStep("how are you", "Iam ok");

	}

}
