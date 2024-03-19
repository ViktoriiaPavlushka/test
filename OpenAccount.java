public class OpenAccount extends Bank{
    public void OpenAccount(User user, String currency, Card card){

        System.out.println("Hello!\nNew user:" + user.getName() + " " + user.getSurName());
        System.out.println("Your currency:" + currency);
        System.out.println("Your number of curd:" + card.NumberOfCard);
    }

}
