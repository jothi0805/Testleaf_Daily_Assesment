package Polymorphism;

public class LoginPage extends BasePage{
	public void performCommonTasks() {
		System.out.println("tasks");
	}
	
	public static void main(String[]args) {
		LoginPage login=new LoginPage();
		login.performCommonTasks();
	}
	

	
}
