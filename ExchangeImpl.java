import java.util.*;
public class ExchangeImpl extends Exchange{

    public void Exchange(PersonalOffice office, long amount, String currency) {

        Map<String, Integer> map = new HashMap<>();
        map.put("USD", 38);
        map.put("EUR", 41);
        map.put("PLN", 9);
        map.put("GBR", 48);
        map.put("CHF", 42);

        long currentSum = office.getSum();

        Set<Map.Entry<String, Integer>> Currency = map.entrySet();

        for(Map.Entry<String, Integer> entry : Currency){
            if(entry.getKey().equals(currency)){
                if(amount*entry.getValue() <= currentSum){
                    office.setSum(currentSum - amount*entry.getValue());
                }
            }
        }
        System.out.println("Your balance now: " + office.getSum() + "\n");
    }
    @Override
    public void PutMoney(PersonalOffice office, long amount) {}
    @Override
    public void TakeMoney(PersonalOffice office, long amount) {}
}
