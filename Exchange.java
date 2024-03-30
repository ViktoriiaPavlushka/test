import java.util.HashMap;
import java.util.Map;
public class Exchange {
    public void Do(double amount, String currencyTo, String currencyFrom, User user) {
        Map<String, Double> mapFromUAH = new HashMap<>();
        mapFromUAH.put("USD", 1/39.0);
        mapFromUAH.put("EUR", 1/42.0);
        mapFromUAH.put("UAH", 1.0);

        Map<String, Double> mapToUAH = new HashMap<>();
        mapToUAH.put("USD", 39.0);
        mapToUAH.put("EUR", 42.0);
        mapToUAH.put("UAH", 1.0);
        double amountInUAH = 0;
        Card sourceCard = user.cards.get(currencyFrom);
        if (sourceCard != null && !currencyFrom.equals("UAH")) {
            Double conversionRateToUAH = mapToUAH.get(currencyFrom);
            if (conversionRateToUAH != null) {
                sourceCard.setBalance (sourceCard.getBalance() - amount);
                amountInUAH = amount * conversionRateToUAH;
            }
        }

        Card targetCard = user.cards.get(currencyTo);
        if (targetCard != null) {
            Double conversionRateFromUAH = mapFromUAH.get(currencyTo);
            if (conversionRateFromUAH != null) {
                double amountInTargetCurrency = amountInUAH * conversionRateFromUAH;
                targetCard.setBalance (targetCard.getBalance() + amountInTargetCurrency);
            }
        }

        if (sourceCard != null) {
            System.out.println("Balance of " + currencyFrom + " card: " + sourceCard.getBalance());
        }

        if (targetCard != null) {
            System.out.println("Balance of " + currencyTo + " card: " + targetCard.getBalance());
        }

        System.out.println("Exchange completed successfully.");
    }
}