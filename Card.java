public abstract class Card {
    long Balance;
    String NumberOfCard;
    String Currency;
    private static long Counter = 0;

    public Card(long Balance, String Currency){
        this.Balance = Balance;
        this.Currency = Currency;
        this.NumberOfCard = String.format("%016d", Counter++);
    }

    public Card(){}
    public long getBalance() {
        return Balance;
    }
    public void setBalance(long Balance) {
        this.Balance = Balance;
    }
}

/*public class UAHCard extends Card{
    String Currency = "UAH";
    public UAHCard(long Balance, String Currency) {
        super(Balance);
        this.Currency = Currency;
    }

}
public class USDCard extends Card{
    String Currency = "USD";
    public USDCard(long Balance, String Currency) {
        super(Balance);
        this.Currency = Currency;
    }

}
public class EURCard extends Card{
    String Currency = "EUR";
    public EURCard(long Balance, String Currency) {
        super(Balance);
        this.Currency = Currency;
    }

}*/


