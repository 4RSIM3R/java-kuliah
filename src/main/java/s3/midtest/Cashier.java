package s3.midtest;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cashier extends Employee {

    private int overtime;
    private int salary;

    public Cashier(String id, String name, String address, String phoneNumber, String gender, int overtime, int salary) {
        super(id, name, address, phoneNumber, gender);
        this.overtime = overtime;
        this.salary = salary;
    }

    @Override
    public void info() {
        super.info();
        System.out.printf("Overtime : %d \n", overtime);
        System.out.printf("Salary : %d \n", salary);
    }
}
