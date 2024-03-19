
public class CreditImpl extends Credit {
    public void CreditTake(Card card, long amount){

        long currentBalance = card.getBalance();
        card.setBalance(currentBalance + amount);

        long currentArrears = card.getArrears();
        card.setArrears(currentArrears + amount);
        System.out.println("Your balance now: " + card.getBalance());
        System.out.println("Your arrears now: " + card.getArrears() + "\n");
    }

}
