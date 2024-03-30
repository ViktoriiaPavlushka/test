public class USDCard extends Card {
    public USDCard(double Balance) {
        super(Balance, "USD", 0, 0.03);
    }

    @Override
    void WriteCurrency() {
        System.out.println("You opened USD card");
    }
}
