public class Bank {
   private Exchange exchange ;
   private Credit credit;
   private PutMoney putmoney;
   private TakeMoney takemoney;

   User OpenAccount(String Name, String Surname, double Balance, String Currency){
       User user = new User(Name, Surname, Balance, Currency);
       System.out.println("Your name: " + Name);
       System.out.println("Your surname: " + Surname);
       System.out.println("Your balance: " + Balance);
       System.out.println("Your currency: " + Currency);
       System.out.println("Your number of card: " + user.cards.get(Currency).getNumberOfCard());
       return user;
   }

    public Bank() {
        this.putmoney = new PutMoney();
        this.credit = new Credit();
        this.takemoney = new TakeMoney();
        this.exchange =  new Exchange();
    }
    void putMoney(double amount, String currency, User user){
      putmoney.Do( amount, currency, user);
   }
    void takeMoney(double amount, String currency, User user){
      takemoney.Do( amount, currency, user);
   }
    void takeMoney(double amount, String currency, User user, String currency2){
      takemoney.Do(amount, currency, user, currency2);
    }
    void credit(double amount, String currency, User user){
      credit.Do(amount, currency, user);
   }
   void exchange(double amount, String currencyTo, String currencyFrom, User user){
      exchange.Do(amount, currencyTo, currencyFrom, user);
   }
}

