package Interface;

public class Concrete implements DataBaseConnection {

	@Override
	public void connect() {
		System.out.println("task1");

	}

	@Override
	public void disconnect() {
		System.out.println("task2");

	}

	@Override
	public void executeUpdate() {
		System.out.println("task3");

	}

	public static void main(String[] args) {

		Concrete c = new Concrete();
		c.connect();
		c.executeUpdate();
		c.disconnect();

	}
}