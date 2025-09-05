package OopsConcepts;

public class Safari extends Chrome {

	public void readerMode() {
		System.out.println("Printing this method name5");
	}

	public void fullScreenMode() {
		System.out.println("Printing this method name6");
	}

	public static void main(String[] args) {
		Safari s = new Safari();
		s.openIncognito();
		s.clearCache();
		s.readerMode();
		s.fullScreenMode();
	}
}
