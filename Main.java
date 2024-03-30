import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println("Enter your personal information.");
        System.out.println("Enter your name:");
        String name = scan.nextLine();
        System.out.println("Enter your surname:");
        String surname = scan.nextLine();
        System.out.println("Enter sum of money on your card:");
        double balance = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter currency of your card:");
        String currency = scan.nextLine();
        User user = bank.OpenAccount(name, surname, balance, currency);

        System.out.println(" 1. New card \n 2. Put money \n 3. Take money \n 4. Credit \n 5. Exchange \n 6. Exit");

        while (true) {
            System.out.print("Select the following actions: ");
            int action = scan.nextInt();
            if(action == 6){
                System.out.print("Good Bye! Don't come back again :)");
                break;
            }else {
                switch (action) {
                    case 1:
                        System.out.println("Enter your currency: ");
                        scan.nextLine();
                        String currency2 = scan.nextLine();
                        System.out.println("Enter your balance: ");
                        double balance2 = scan.nextDouble();
                        Card card = user.NewCard(balance2, currency2);
                        card.WriteCurrency();
                        break;
                    case 2:
                        System.out.print("Enter your amount: ");
                        double amount = scan.nextDouble();
                        scan.nextLine();
                        System.out.print("Enter your currency: ");
                        String ccurrency = scan.nextLine();
                        bank.putMoney(amount, ccurrency, user);
                        break;
                    case 3:
                        System.out.print("If you want to take money of another currency write '1', else '2': ");
                        int number = scan.nextInt();
                        if(number == 2){
                            System.out.print("Enter your amount: ");
                            amount = scan.nextDouble();
                            scan.nextLine();
                            System.out.print("Enter your currency: ");
                            String ccurrency2 = scan.nextLine();
                            bank.takeMoney(amount, ccurrency2, user);
                        }else{
                            System.out.print("Enter your card-from currency: ");
                            scan.nextLine();
                            String currencyFrom = scan.nextLine();
                            System.out.print("Enter your currency: ");
                            String currencyTo = scan.nextLine();
                            System.out.print("Enter your amount: ");
                            amount = scan.nextDouble();
                            bank.takeMoney(amount, currencyFrom, user, currencyTo);
                        }
                        break;
                    case 4:
                        System.out.print("Enter your credit amount: ");
                        amount = scan.nextDouble();
                        scan.nextLine();
                        System.out.print("Enter your currency: ");
                        String ccurrency2 = scan.nextLine();
                        bank.credit(amount, ccurrency2, user);
                        break;
                    case 5:
                        System.out.print("Enter your card-from currency: ");
                        scan.nextLine();
                        String currencyFrom = scan.nextLine();
                        System.out.print("Enter your card-to currency: ");
                        String currencyTo = scan.nextLine();
                        System.out.print("Enter your amount: ");
                        amount = scan.nextDouble();
                        bank.exchange(amount, currencyTo, currencyFrom, user);
                        break;
                    default:
                        System.out.println("Error. Wrong choice");
                        break;
                }
            }
        }
    }
}
