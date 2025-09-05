package Interface;

public class JavaConnection extends MySqlConnection {

	public static void main(String[] args) {

		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.executeQuery();

	}

	@Override
	public void connect() {
		System.out.println("task5");

	}

	@Override
	public void disconnect() {
		System.out.println("task6");

	}

	@Override
	public void executeUpdate() {
		System.out.println("task7");

	}

}
