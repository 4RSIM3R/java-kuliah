package s2.w2;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    static Locale locale = new Locale("in", "ID");
    static NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);

    public static void main(String[] args) {
        Item item = new Item();
        Item secondItem = new Item("Logitech", "Electronic", 25, 150000);
        SecondItem anotherItem = new SecondItem("Mouse Logitech", 150000, 10);

        item.setItemsName("DDR RAM 2GB");
        item.setItemsType("Electronic");
        item.setPrice(250000);
        item.setStock(10);
        item.increaseStock(1);
        item.decreaseStock(3);
        item.displayInformation();

        System.out.println("");

        secondItem.displayInformation();

        System.out.println("");

        int totalPrice = anotherItem.getTotalPrice();
        int afterDiscount = anotherItem.getAfterDiscountPrice();
        int finalPrice = anotherItem.getFinalPrice();

        System.out.printf("Total Price : %s \n", numberFormat.format(totalPrice));
        System.out.printf("Discount : %s \n", numberFormat.format(afterDiscount));
        System.out.printf("Final Price : %s", numberFormat.format(finalPrice));

    }

}
