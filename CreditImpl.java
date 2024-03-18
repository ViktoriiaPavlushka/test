
public class CreditImpl extends Credit {
    public void CreditTake(PersonalOffice office, Card card, long amount){

        long currentBalance = card.getBalance();
        card.setBalance(currentBalance + amount);

        long currentArrears = office.getArrears();
        office.setArrears(currentArrears + amount);
        System.out.println("Your balance now: " + card.getBalance());
        System.out.println("Your arrears now: " + office.getArrears() + "\n");
    }


    @Override
    public void PutMoney(Card card, long amount) {

    }

    @Override
    public void TakeMoney(long amount, Card card) {

    }
}
