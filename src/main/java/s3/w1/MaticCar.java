package s3.w1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MaticCar extends Car {

    private String transmission;

    @Override
    public void checkStatus() {
        super.checkStatus();
        System.out.printf("Transmission : %s", transmission);
    }
}
