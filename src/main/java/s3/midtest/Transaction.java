package s3.midtest;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Transaction {

    private String number;
    private String createdAt;
    private Customer customer;
    private Product product;
    private Cashier cashier;

    public void info() {
        System.out.println("Product Info \n");
        System.out.printf("Transaction Number : %s \n", number);
        System.out.printf("Created At : %s \n", createdAt);
        System.out.println("");
        System.out.println("Employee Info \n");
        cashier.info();
        System.out.println("");
        System.out.println("Customer Info \n");
        customer.info();
        System.out.println("");
        System.out.println("Product Info \n");
        product.info();
    }

}
