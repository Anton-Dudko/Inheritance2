package by.epam.lab;

public abstract class AbstractPurchase implements Comparable<AbstractPurchase>{
    private Product product;
    private int number;

    public AbstractPurchase() {
    }

    public AbstractPurchase(Product product, int number) {
        this.product = product;
        this.number = number;
    }

    public Product getProduct() {
        return product;
    }

    public int getNumber() {
        return number;
    }

    public Byn getCost(){
        return unitPrice().mul(number).roundDown();
    }

    public abstract Byn unitPrice();

    @Override
    public int compareTo(AbstractPurchase o) {
        return (o.getCost().sub(this.getCost())).getValue();
    }

    protected String fieldsToString() {
        return String.format("%s;%d",product, number);
    }

    @Override
    public String toString() {
        return String.format("%s;%s", fieldsToString(), getCost());
    }



}
