import java.util.*;
public class PersonalOffice {
    private String Name;
    private String Surname;
    private long Arrears;
    public PersonalOffice(String Name, String Surname, long Arrears){
        this.Name = Name;
        this.Surname = Surname;
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
    public long getArrears() {
        return Arrears;
    }
    public void setArrears(long Arrears) {
        this.Arrears = Arrears;
    }

    List <Card> cards = new ArrayList<>();
}
