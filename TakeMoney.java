

public class TakeMoney extends Operations{

    @Override
    public void PutMoney(Card card, long amount) {
    }

    public void TakeMoney(long amount, Card card){

        long currentBalance = card.getBalance();
        if(currentBalance >= amount) {
            card.setBalance(currentBalance - amount);
            System.out.println("Your balance now: " + card.getBalance() + "\n");
        }else{
            System.out.println("You can not do this operation.\n");
        }
    }

}
