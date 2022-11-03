package s3.midtest;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Customer {

    private String id;
    private String name;
    private String address;

    public void info() {
        System.out.printf("ID :  %s \n", id);
        System.out.printf("Name :  %s \n", name);
        System.out.printf("Address :  %s \n", address);
    }

}
