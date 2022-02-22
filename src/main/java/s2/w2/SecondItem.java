package s2.w2;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecondItem {

    public String name;
    public int price, quantity;

    public int getTotalPrice() {
        return price * quantity;
    }

    public int getAfterDiscountPrice() {
        int totalPrice = getTotalPrice();
        double totalDiscount = 0;

        if (totalPrice >= 50000 && totalPrice <= 100000) {
            totalDiscount = totalPrice * 0.05;
        } else if (totalPrice > 100000) {
            totalDiscount = totalPrice * 0.1;
        } else {
            totalDiscount = 0;
        }

        return ((int) totalDiscount);

    }

    public int getFinalPrice() {
        return getTotalPrice() - getAfterDiscountPrice();
    }

}
