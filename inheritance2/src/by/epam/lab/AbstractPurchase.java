package by.epam.lab;

public abstract class AbstractPurchase implements Comparable<AbstractPurchase>{
    private final Product product;
    private int number;

    protected AbstractPurchase() {
        product = null;
        number = 0;
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

    public Byn getCost() {
        Byn baseCost = product.getPrice().mul(number);
        Byn finalCost = getFinalCost(baseCost);
		return finalCost.round(RoundMethod.FLOOR, 2);
    }

    protected abstract Byn getFinalCost(Byn baseCost);

    @Override
    public int compareTo(AbstractPurchase o) {
        return getCost().compareTo(o.getCost());
    }

    protected String fieldsToString() {
        return String.format("%s;%d",product, number);
    }

    @Override
    public String toString() {
        return String.format("%s;%s", fieldsToString(), getCost());
    }



}
