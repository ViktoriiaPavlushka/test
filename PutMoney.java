

public class PutMoney implements Bank{
    public void PutMoney(PersonalOffice office, long amount){

        long currentSum = office.getSum();
        office.setSum(currentSum + amount);
        System.out.println("Your balance now: " + office.getSum() + "\n");
    }

    @Override
    public void TakeMoney(PersonalOffice office, long amount) {}
}
