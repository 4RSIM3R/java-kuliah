package s3.w4;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Encapsulation {

    private String name;
    private int age;


    public void setAge(int age) {
        this.age = Math.min(age, 30);
    }

    @Override
    public String toString() {
        return "Name : " + name + "\n" + "Age : " + age;
    }
}
