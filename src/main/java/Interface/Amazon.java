package Interface;

public class Amazon extends CanaraBank {

	public static void main(String[] args) {
		
		Amazon a=new Amazon();
		a.cashOnDelivery();
		a.upiPayments();
		a.cardPayments();
		a.internetBanking();
		a.recordPaymentDetails();

	}

}
