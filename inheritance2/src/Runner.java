import by.epam.lab.*;

import java.util.Arrays;
import java.util.Collections;

public class Runner {
    public static void main(String[] args) {
        Product tea = new Product("Green tea", 170);
        AbstractPurchase[] purchases = {
                new PurchaseDiscount(tea, 5, 10),
                new PurchaseDiscount(tea, 7, 14),
                new PurchasePercentDiscount(tea, 10, 20),
                new PurchasePercentDiscount(tea, 15, 30),
                new PurchaseWithTransportCosts(tea, 20, 400),
                new PurchaseWithTransportCosts(tea, 40, 800)
        };
        Utils.print(purchases);
        System.out.println("---------------------");
        Arrays.sort(purchases);
        Utils.print(purchases);
        System.out.println("Минимальная стоимость = " + (purchases[purchases.length-1]));

        int result = Utils.search(purchases);
        if(result >= 0){
            System.out.println("Найденная покупка: " + purchases[result]);
        }
        else{
            System.out.println("Покупка не найдена!");
        }


    }
}
