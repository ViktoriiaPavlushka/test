

public class TakeMoney implements Bank{

    public void TakeMoney(PersonalOffice office, long amount){

        long currentSum = office.getSum();
        if(currentSum >= amount) {
            office.setSum(currentSum - amount);
            System.out.println("Your balance now: " + office.getSum() + "\n");
        }else{
            System.out.println("You can not do this operation.\n");
        }
    }
    @Override
    public void PutMoney(PersonalOffice office, long amount) {}
}
