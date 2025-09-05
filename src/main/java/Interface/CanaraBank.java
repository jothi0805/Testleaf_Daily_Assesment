package Interface;

public abstract class CanaraBank implements Payments {

	@Override
	public void cashOnDelivery() {
		System.out.println("yes");

	}

	@Override
	public void upiPayments() {
		System.out.println("Url");

	}

	@Override
	public void cardPayments() {
		System.out.println("Card number");

	}

	@Override
	public void internetBanking() {
		System.out.println("login");

	}

	public void recordPaymentDetails() {
		System.out.println("Details");
	}
}
