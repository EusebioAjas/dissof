public class DebitCardAdapter implements Payment {
    DebitCard debitCard = new DebitCard();

    @Override
    public void pay(double amount) {
        debitCard.payment(amount);
    }
}
