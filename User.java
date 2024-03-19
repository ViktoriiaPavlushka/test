import java.util.*;
public class User {
    Card card;
    private String Name;
    private String Surname;

    public User(String Name, String Surname, Card card){
        this.Name = Name;
        this.Surname = Surname;
        this.card = card;
    }
    public User(){}

    //геттери і сеттери
    public String getName() {
        return Name;
    }
    public String getSurName() {
        return Surname;
    }

}
