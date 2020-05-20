public class Client{

    public void makePayment(Payment payment, double amount) {
        payment.pay(amount);
    }

    public static void main(String args[]) {
        Client client = new Client();

        client.makePayment(new DebitCardAdapter(), 300.0);
        client.makePayment(new CreditCardAdapter(), 500.0);
        client.makePayment(new PayPalAdapter(), 200.0);
    }
}
