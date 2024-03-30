import java.util.Map;

public class PutMoney implements Operations {
    @Override
    public void Do(double amount, String currency, User user) {
        Card targetCard = user.cards.get(currency);
        if (targetCard != null) {
            double newBalance = targetCard.getBalance() + amount;
            targetCard.setBalance(newBalance);
            System.out.println("Your balance now: " + targetCard.getBalance() + "\n");
        } else {
            System.out.println("This card doesn't exist.");
        }
    }
}
