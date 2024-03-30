public class UAHCard extends Card {
    public UAHCard(double Balance) {
        super(Balance, "UAH", 0, 1);
    }

    @Override
    void WriteCurrency() {
        System.out.println("You opened UAH card");
    }
}
