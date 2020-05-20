public class PayPalAdapter implements Payment {
    PayPal payPal = new PayPal();

    @Override
    public void pay(double amount) {
        payPal.sendPayment(amount);
    }
}
