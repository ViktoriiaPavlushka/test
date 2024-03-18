

public class PutMoney extends Operations{
    public void PutMoney(Card card, long amount){

        long currentBalance = card.getBalance();
        card.setBalance(currentBalance + amount);
        System.out.println("Your balance now: " + card.getBalance() + "\n");
    }

    @Override
    public void TakeMoney(long amount, Card card) {

    }

}
