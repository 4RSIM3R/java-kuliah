package s3.w1.plane;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Plane {

    private String manufacturer;
    private String id;
    private int altitude = 0;

    public void increaseAltitude(int targetAltitude) {
        altitude += targetAltitude;
    }

    public void decreaseAltitude(int targetAltitude) {
        altitude -= targetAltitude;
    }

    public void checkStatus() {
        System.out.printf("Manufacturer : %s \n", manufacturer);
        System.out.printf("ID : %s \n", id);
        System.out.printf("Altitude : %d \n", altitude);
    }

}
