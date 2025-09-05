package Polymorphism;

public class MethodOverloading {

	public void reporStep(String msg, String status) {
		System.out.println(msg);
		System.out.println(status);

	}

	public void reportStep(String msg, String status, boolean snap) {
		System.out.println(msg);
		System.out.println(status);
		System.out.println(snap);
	}

	public static void main(String[] args) {
		MethodOverloading over = new MethodOverloading();
		over.reporStep("hi", "hello");
		over.reportStep("how are you", "had your breakfast", false);

	}

}
