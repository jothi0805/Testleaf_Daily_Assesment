package OopsConcepts;

public class Edge extends Browser {

	public void takeSnap() {
		System.out.println("Printing this method name3");
	}

	public void clearCookies() {
		System.out.println("Printing this method name4");
	}

	public static void main(String[] args) {
		Edge e = new Edge();
		e.openURL();
		e.closeBrowser();
		e.navigateBack();
		e.takeSnap();
		e.clearCookies();
	}
}