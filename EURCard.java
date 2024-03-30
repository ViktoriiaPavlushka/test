public class EURCard extends Card {
    public EURCard(double Balance) {
        super(Balance, "EUR", 0, 0.03);
    }

    @Override
    void WriteCurrency() {
        System.out.println("You opened EUR card");
    }
}
