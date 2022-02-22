package s2.w2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.NumberFormat;
import java.util.Locale;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    /*
    * Rather than type a manual `constructor` i use a package called `Lombok`
    * That will help developer write a Java boilerplate code like :
    * setter, getter, empty constructor, all args constructor, etc
    */

    public String itemsName, itemsType;
    public  int stock, price;

    static Locale locale = new Locale("in", "ID");
    static NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);

    public void decreaseStock(int n) {
        stock -= n;
    }

    public void increaseStock(int n) {
        stock += n;
    }

    public void displayInformation() {
        System.out.printf("Name : %s \n", itemsName);
        System.out.printf("Type : %s \n", itemsType);
        System.out.printf("Price : %s \n", numberFormat.format(price));
        System.out.printf("Stock : %d \n", stock);
    }




}
