public class OpenAccount implements Bank{
    public void OpenAccount(PersonalOffice office, String currency, Card card){

        System.out.println("Hello!\nNew user:" + office.getName() + " " + office.getSurName());
        System.out.println("Your currency:" + currency);
        System.out.println("Your number of curd:" + card.NumberOfCard);
    }

}
