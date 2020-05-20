public class CreditCardAdapter implements Payment {
    CreditCard creditCard = new CreditCard();

    @Override
    public void pay(double amount) {
        creditCard.executePay(amount);
    }
}
