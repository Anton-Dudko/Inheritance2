package by.epam.lab;

public class PurchaseDiscount extends AbstractPurchase{
    private Byn discount;

    public PurchaseDiscount() {
    }

    public PurchaseDiscount(Product product, int number, Byn discount) {
        super(product, number);
        this.discount = discount;
    }

    public PurchaseDiscount(Product product, int number, int discount) {
        super(product, number);
        this.discount = new Byn(discount);
    }

    public Byn getDiscount() {
        return discount;
    }

    @Override
    public Byn unitPrice() {
        return getProduct().getPrice().sub(discount);
    }

    @Override
    public String toString() {
        return String.format("%s;%s", super.fieldsToString(), discount);
    }
}
