package s3.midtest;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.lang.reflect.Field;

@AllArgsConstructor
@Data
public class Employee {

    private String id;
    private String name;
    private String address;
    private String phoneNumber;
    private String gender;

//    public void info() throws ClassNotFoundException, IllegalAccessException {
//        Class<?> internal = Class.forName("s3.midtest.Employee");
//        Field[] fields = internal.getDeclaredFields();
//        for (Field field : fields) {
//            System.out.println(field.get(internal));
//        }
//    }

    public void info() {
        System.out.printf("ID : %s \n", id);
        System.out.printf("Name : %s \n", name);
        System.out.printf("Address : %s \n", address);
        System.out.printf("Phone Number : %s \n", phoneNumber);
        System.out.printf("Gender : %s \n", gender);
    }

}
