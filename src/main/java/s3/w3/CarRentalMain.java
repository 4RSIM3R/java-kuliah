package s3.w3;

public class CarRentalMain {

    public static void main(String[] args) {
        CarRental carRental = new CarRental("INV/2022/1", "Honda Civic",
                "Paijo", 2, "ACTIVE",
                10, 100, 150);

        float price = carRental.getFinalPrice(false, false);

        System.out.printf("Total Price : %.0f", price);

        System.out.println("\n");

        carRental.showInfo();

    }

}
