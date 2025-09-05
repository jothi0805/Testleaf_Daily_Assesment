package OopsConcepts;

public class LoginTestData extends TestData {

	public void enterUsername() {
		System.out.println("testleaf");
	}

	public void enterPassword() {
		System.out.println("CRMSFA");
	}

	public static void main(String[] args) {
		LoginTestData login = new LoginTestData();
		login.enterCredentials();
		login.navigateToHomePage();
		login.enterUsername();
		login.enterPassword();
	}
}
