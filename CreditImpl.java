
public class CreditImpl extends Credit {
    public void CreditTake(PersonalOffice office, long amount){

        long currentSum = office.getSum();
        office.setSum(currentSum + amount);

        long currentArrears = office.getArrears();
        office.setArrears(currentArrears + amount);
        System.out.println("Your balance now: " + office.getSum());
        System.out.println("Your arrears now: " + office.getArrears() + "\n");
    }

    @Override
    public void PutMoney(PersonalOffice office, long amount) {
        long currentSum = office.getSum();
        office.setSum(currentSum + amount);
    }
    @Override
    public void TakeMoney(PersonalOffice office, long amount) {}
}
