package s2.midtest;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Customer {

    private String accountNumber;
    private String name;
    private int ssn;
    private int age;
    private double balance;

    public void show() {
        System.out.println("=================");
        System.out.printf("Account Number : %s \n", accountNumber);
        System.out.printf("Name : %s \n", name);
        System.out.printf("NIN : %d \n", ssn);
        System.out.printf("Age : %d \n", age);
        System.out.printf("Balance : %s \n", balance);
    }

}
