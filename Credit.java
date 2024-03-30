import java.util.Map;

public class Credit extends PutMoney{
    @Override
    public void Do(double amount, String currency, User user) {
        Card targetCard = user.cards.get(currency);
        if (targetCard != null) {
            targetCard.setArrears(targetCard.getArrears() + amount);
            System.out.println("Your arrears now: " + targetCard.getArrears());
            super.Do(amount, currency, user);
        } else {
            System.out.println("This card doesn`t exist");
        }
    }
}