import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TakeMoney extends Bank{

    public void TakeMoney(long amount, Card card){

        long currentBalance = card.getBalance();
        if(currentBalance >= amount) {
            card.setBalance(currentBalance - amount);
            System.out.println("Your balance now: " + card.getBalance() + "\n");
        }else{
            System.out.println("You can not do this operation.\n");
        }
    }
    public void TakeMoney(Card card, long amount, String currency){

        Map<String, Integer> map = new HashMap<>();
        map.put("USD", 38);
        map.put("EUR", 41);
        long currentBalance = card.getBalance();

        Set<Map.Entry<String, Integer>> Currency = map.entrySet();

        for(Map.Entry<String, Integer> entry : Currency){
            if(entry.getKey().equals(currency)){
                if(amount*entry.getValue() <= currentBalance){
                    card.setBalance(currentBalance - amount*entry.getValue());
                }else {
                    System.out.println("You can not do this operation.\n");
                }
            }
        }
        System.out.println("Your balance now: " + card.getBalance() + "\n");
    }


}
