package seleniumprogram.week2;

public class Browser {
	void launchBrowser(String browserName) {
		System.out.println("browsername");
	}

	String loadUrl() {
		String s = ("Url loaded successfully");
		return s;
	}

	public static void main(String[] args) {
		Browser bro = new Browser();
		bro.launchBrowser(null);
		bro.loadUrl();

	}

}
