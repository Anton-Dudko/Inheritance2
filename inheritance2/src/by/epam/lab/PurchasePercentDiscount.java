package by.epam.lab;

public class PurchasePercentDiscount extends AbstractPurchase{
    private static final int LIMIT = 11;
    private double percentDiscount;

    public PurchasePercentDiscount() {
    }

    public PurchasePercentDiscount(Product product, int number, double percentDiscount){
        super(product, number);
        this.percentDiscount = percentDiscount;
    }

    @Override
    protected Byn getFinalCost(Byn baseCost) {
        Byn byn = baseCost;
        if (getNumber() >= LIMIT) {
            byn = byn.mul(1.0 - percentDiscount / 100, RoundMethod.FLOOR, 0);
        }
        return byn;
    }

    @Override
    protected String fieldsToString() {
        return String.format("%s;%.2f", super.fieldsToString(), percentDiscount);
    }

}
