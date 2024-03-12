
public class PersonalOffice {
    private String Name;
    private String Surname;
    private long NumberOfCard;
    private long Sum;
    private long Arrears;
    public PersonalOffice(String Name, String Surname, long NumberOfCard, long Sum, long Arrears){
        this.Name = Name;
        this.Surname = Surname;
        this.NumberOfCard = NumberOfCard;
        this.Sum = Sum;
        this.Arrears = Arrears;
    }
    public PersonalOffice(){}

    //геттери і сеттери
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getSurName() {
        return Surname;
    }
    public void setSurName(String Surname) {
        this.Surname = Surname;
    }
    public long getNumberOfCard() {
        return NumberOfCard;
    }
    public void setNumberOfCard(long NumberOfCard) {
        this.NumberOfCard = NumberOfCard;
    }
    public long getSum() {
        return Sum;
    }
    public void setSum(long Sum) {
        this.Sum = Sum;
    }
    public long getArrears() {
        return Arrears;
    }
    public void setArrears(long Arrears) {
        this.Arrears = Arrears;
    }
}
