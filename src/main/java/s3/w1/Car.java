package s3.w1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Car {

    private String mark;
    private int speed, gear;

    public void increaseSpeed(int targetSpeed) {
        speed += targetSpeed;
    }

    public void decreaseSpeed(int targetSpeed) {
        speed -= targetSpeed;
    }

    public void changeGear(int targetGear) {
        gear = targetGear;
    }


    public void checkStatus() {
        System.out.printf("Trade Mark : %s \n", mark);
        System.out.printf("Speed : %s \n", speed);
        System.out.printf("Gear : %s \n", gear);
    }

}
