public abstract class Card {
    long Balance;
    String NumberOfCard;
    String Currency;
    private long Arrears;
    private static long Counter = 0;

    public Card(long Balance, String Currency, long Arrears){
        this.Balance = Balance;
        this.Currency = Currency;
        this.Arrears = Arrears;
        this.NumberOfCard = String.format("%016d", Counter++);
    }

    public Card(){}

    public long getBalance() {
        return Balance;
    }
    public void setBalance(long Balance) {
        this.Balance = Balance;
    }
    public long getArrears() {
        return Arrears;
    }
    public void setArrears(long Arrears) {
        this.Arrears = Arrears;
    }
}




