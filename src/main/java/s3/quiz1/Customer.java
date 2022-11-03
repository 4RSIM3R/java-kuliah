package s3.quiz1;

import lombok.Getter;
import lombok.Setter;

public class Customer {

    @Getter
    private String firstName;

    @Getter
    private String lastName;

    @Setter
    @Getter
    private Account account;

    Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }



}
