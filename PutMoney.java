

public class PutMoney extends Bank{
    public void PutMoney(Card card, long amount){

        long currentBalance = card.getBalance();
        card.setBalance(currentBalance + amount);
        System.out.println("Your balance now: " + card.getBalance() + "\n");
    }


}
