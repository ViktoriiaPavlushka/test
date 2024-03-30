import java.util.HashMap;
import java.util.Map;

public class TakeMoney implements Operations{

    @Override
    public void Do(double amount, String currency, User user){
        Card targetCard = user.cards.get(currency);
        double Fee = amount*targetCard.getFee();
        if (targetCard != null) {
            if(targetCard.getBalance() >= amount) {
                targetCard.setBalance(targetCard.getBalance() - amount - Fee);
                System.out.println("Your balance now: " + targetCard.getBalance() + "\n");
            }else{
                System.out.println("You can`t do this operation.");
            }
        } else {
            System.out.println("This card doesn`t exist " );
        }
    }

    public void Do(double amount, String currency, User user, String currency2){
        if(currency.equals("UAH")) {
            Map<String, Long> map = new HashMap<>();
            map.put("USD", 38L);
            map.put("EUR", 41L);

            Long conversionRate = map.get(currency2);
            if (conversionRate != null) {
                Card targetCard = user.cards.get(currency);
                if (targetCard != null) {
                    if (targetCard.getBalance() >= amount * conversionRate) {
                        targetCard.setBalance(targetCard.getBalance() - amount * conversionRate);
                        System.out.println("Your balance now: " + targetCard.getBalance() + "\n");
                    } else {
                        System.out.println("You can`t do this operation.");
                    }
                } else {
                    System.out.println("This card doesn`t exist ");
                }
            }
        }else{
            System.out.println("You can`t do this operation.");
        }
    }
}