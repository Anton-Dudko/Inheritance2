import by.epam.lab.*;
import org.junit.Assert;
import org.junit.Test;

public class Tests {
    @Test
    public void testBynConstuctor() {
        Byn byn1 = new Byn(333);
        Byn byn2 = new Byn(byn1);
        Assert.assertEquals(true, byn2.equals(byn1));
        Assert.assertEquals("3.33", byn2.toString());
        Assert.assertFalse(byn2 == byn1);
    }

    @Test
    public void testAdd() {
        Byn byn1 = new Byn(7);
        Byn byn2 = new Byn(7);
        Byn result = new Byn (14);
        Assert.assertEquals(result, byn1.add(byn2));
    }

    @Test
    public void testToString() {
        Product product = new Product("Test",17);
        String result = "Test;0.17";
        Assert.assertEquals(result, product.toString());
    }

    @Test
    public void searchTestNotElement() {
        Product tea = new Product("Green tea", 170);
        AbstractPurchase[] arrayTest = {
                new PurchaseWithTransportCosts(tea, 14, 999),
                new PurchaseDiscount(tea, 15, 17),
                new PurchaseWithTransportCosts(tea, 17, 777),
                new PurchaseDiscount(tea, 10, 12),
                new PurchasePercentDiscount(tea, 7, 7),
                new PurchasePercentDiscount(tea, 5, 10)
        };
        Assert.assertTrue(Utils.search(arrayTest) < 0);
    }

}