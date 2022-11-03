package s3.w6;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;


public class Employee {

    private final HashMap<String, Integer> mapGroupToSalary = new HashMap<>();

    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String id;
    @Getter
    private String group;
    @Getter
    @Setter
    private double salary;

    Employee() {
        mapGroupToSalary.put("1", 550000);
        mapGroupToSalary.put("2", 450000);
        mapGroupToSalary.put("3", 350000);
        mapGroupToSalary.put("4", 250000);
        mapGroupToSalary.put("5", 150000);

    }

    public void setGroup(String group) {
        this.group = group;
        this.salary = mapGroupToSalary.get(group);
    }
}
