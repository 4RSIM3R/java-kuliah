package s3.w6;

import lombok.Getter;
import lombok.Setter;

public class Staff extends Employee {

    @Setter
    @Getter
    private int overtime;

    @Setter
    @Getter
    private double overtimeSalary;

    @Override
    public double getSalary() {
        return super.getSalary() + (this.overtime * overtimeSalary);
    }

    public void info() {
        System.out.printf("ID : %s", this.getId());
        System.out.printf("Name : %s", this.getName());
        System.out.printf("Group : %s", this.getGroup());
        System.out.printf("Overtime : %d", this.getOvertime());
        System.out.printf("Overtime Salary : %.0f", this.getOvertimeSalary());
        System.out.printf("Salary : %.0f", this.getSalary());


    }

}
