package by.epam.lab;

public class PurchasePercentDiscount extends AbstractPurchase{
    private final int limit = 11;
    private double percentDiscount;

    public PurchasePercentDiscount() {
    }

    public PurchasePercentDiscount(Product product, int number, double percentDiscount){
        super(product, number);
        this.percentDiscount = percentDiscount;
    }

    public int getLimit() {
        return limit;
    }

    @Override
    public Byn unitPrice() {
        double discount = percentDiscount;
        if (getNumber() < limit) {
            discount = 0;
        }
        return getProduct().getPrice().mul((1-discount/100));
    }

    @Override
    public String fieldsToString() {
        return String.format("%s;%s", super.fieldsToString(), percentDiscount);
    }

}
