import by.epam.lab.AbstractPurchase;
import by.epam.lab.Product;
import by.epam.lab.PurchaseDiscount;

import java.util.Arrays;

public class Utils {
    public static void print(AbstractPurchase[] purchases){
        for (AbstractPurchase purchase: purchases) {
            System.out.println(purchase);
        }
    }

    public static int search(AbstractPurchase[] purchases){
        Product product = new Product("example",500);
        AbstractPurchase purchase = new PurchaseDiscount(product, 5, 10);
        return Arrays.binarySearch(purchases, purchase);
    }
}
