package OopsConcepts;

public class Chrome extends Browser {

	public void openIncognito() {
		System.out.println("Printing this method name1");
	}

	public void clearCache() {
		System.out.println("Printing this method name2");
	}

	public static void main(String[] args) {
		Chrome c = new Chrome();
		c.openURL();
		c.closeBrowser();
		c.navigateBack();
		c.openIncognito();
		c.clearCache();
	}
}