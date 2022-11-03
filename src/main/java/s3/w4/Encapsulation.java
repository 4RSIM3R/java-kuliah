package s3.w4;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Encapsulation {

    private String name;
    private int age;


    public void setAge(int age) throws Exception {
       if (age > 15 && age < 55) {
           this.age = age;
       } else {
           throw new Exception("Invalid Age"); // throw exception when age is not fit the rules
       }
    }

    @Override
    public String toString() {
        return "Name : " + name + "\n" + "Age : " + age;
    }
}
