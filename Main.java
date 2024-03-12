import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Bank putmoney = new PutMoney();
        Bank takemoney = new TakeMoney();
        CreditImpl credit = new CreditImpl();
        ExchangeImpl exchange = new ExchangeImpl();

        System.out.print("Enter your personal information. \n");
        System.out.print("Enter your name: \n");
        String name = scan.nextLine();
        System.out.print("Enter your surname: \n");
        String surname = scan.nextLine();
        System.out.print("Enter number of your card: \n");
        long numberOfCard = scan.nextLong();
        System.out.print("Enter sum of money on your card: \n");
        long sum = scan.nextLong();
        System.out.print("Enter your arrears: \n");
        long arrears = scan.nextLong();

        PersonalOffice Person1 = new PersonalOffice(name, surname, numberOfCard, sum, arrears);

        System.out.print(" 1. Put money \n 2. Take money \n 3. Credit \n 4. Exchange \n 5. Exit \n\n");

        while (true) {
            System.out.print("Select the following actions: ");
            int action = scan.nextInt();
            if(action == 5){
                System.out.print("Good Bye!");
                break;
            }else {
                switch (action) {
                    case 1:
                        System.out.print("Enter your amount: ");
                        long amount = scan.nextLong();
                        putmoney.PutMoney(Person1, amount);
                        break;
                    case 2:
                        System.out.print("Enter your amount: ");
                        amount = scan.nextLong();
                        takemoney.TakeMoney(Person1, amount);
                        break;
                    case 3:
                        System.out.print("Enter your credit amount: ");
                        amount = scan.nextLong();
                        credit.CreditTake(Person1, amount);
                        break;
                    case 4:
                        System.out.print("Enter your amount: ");
                        amount = scan.nextLong();
                        scan.nextLine();
                        System.out.print("Enter your currency: ");
                        String currency = scan.nextLine();
                        exchange.Exchange(Person1, amount, currency);
                        break;
                    default:
                        System.out.println("Error. Wrong choice");
                        break;
                }
            }
        }
    }
}
