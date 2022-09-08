package s3.w3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class CarRental {

    private String invoiceId;
    private String carName;
    private String customerName;
    private int duration;
    private String driverStatus;
    private float discount;
    private float price;
    private float driverIncludedPrice;

    public float getFinalPrice(boolean isDriverIncluded, boolean isBoth) {
        float rawPrice, finalPrice = 0;
        if (isBoth) {
            rawPrice = (duration * driverIncludedPrice) + (duration * price);
        }
        else if (isDriverIncluded) {
            rawPrice = duration * driverIncludedPrice;
        } else {
            rawPrice = duration * price;
        }

        finalPrice = rawPrice - ((discount / 100) * rawPrice);
        return finalPrice;
    }

    public void showInfo() {
        System.out.printf("Invoice ID : %s \n", invoiceId);
        System.out.printf("Car Name : %s \n", invoiceId);
        System.out.printf("Customer Name : %s \n", invoiceId);
        System.out.printf("Duration : %d \n", duration);
        System.out.printf("Driver Status : %s \n", invoiceId);
        System.out.printf("Discount : %.0f \n", discount);
        System.out.printf("Price : %.0f \n", price);
        System.out.printf("Driver Included Price : %s \n", invoiceId);
    }


}
