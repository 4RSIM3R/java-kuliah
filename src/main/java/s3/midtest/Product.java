package s3.midtest;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Product {

    private String id;
    private String name;
    private int stock;
    private int price;

    public void info() {
        System.out.printf("ID : %s \n", id);
        System.out.printf("Name : %s \n", name);
        System.out.printf("Stock : %d \n", stock);
        System.out.printf("Price : %d \n", price);
    }

}
