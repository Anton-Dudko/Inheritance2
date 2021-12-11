package by.epam.lab;

public class PurchaseWithTransportCosts extends AbstractPurchase{
    private Byn transportCosts;

    public PurchaseWithTransportCosts(){

    }

    public PurchaseWithTransportCosts (Product product, int number, Byn transportCosts) {
        super(product, number);
        this.transportCosts = transportCosts;
    }

    public PurchaseWithTransportCosts (Product product, int number, int transportCosts) {
        super(product, number);
        this.transportCosts = new Byn(transportCosts);
    }

    @Override
    public Byn unitPrice() {
        return getProduct().getPrice().add(transportCosts);
    }

    @Override
    public String fieldsToString() {
        return String.format("%s;%s", super.fieldsToString(), transportCosts);
    }
}
