import java.util.*;
public class User {
    Map<String, Card> cards = new HashMap<>();
    Set<Map.Entry<String, Card>> Cards = cards.entrySet();
    private String Name;
    private String Surname;

    public User(String Name, String Surname, double Balance, String Currency){
        this.Name = Name;
        this.Surname = Surname;
        if (Currency.equals("USD")) {
            Card cardUSD = new USDCard(Balance);
            cards.put("USD", cardUSD);
        }else if (Currency.equals("EUR")) {
            Card cardEUR = new EURCard(Balance);
            cards.put("EUR", cardEUR);
        }else{
            Card cardUAH = new UAHCard(Balance);
            cards.put("UAH", cardUAH);
        }

    }

    //геттери і сеттери
    public String getName() {
        return Name;
    }
    public String getSurName() {
        return Surname;
    }
    Card NewCard(double Balance, String Currency ){
        if (Currency.equals("USD")) {
            Card cardUSD = new USDCard(Balance);
            cards.put("USD", cardUSD);
            System.out.println("Your card is done.");
            return cardUSD;
        }else if (Currency.equals("EUR")) {
            Card cardEUR = new EURCard(Balance);
            cards.put("EUR", cardEUR);
            System.out.println("Your card is done.");
            return cardEUR;
        }else{
            Card cardUAH = new UAHCard(Balance);
            cards.put("UAH", cardUAH);
            System.out.println("Your card is done.");
            return cardUAH;
        }

    }


}
