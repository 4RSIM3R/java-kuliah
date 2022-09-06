package s3.w1.plane;

public class Main {

    public static void main(String[] args) {

        Plane fighterPlane = new FighterPlane();
        Plane cargoPlane = new CargoPlane();
        Plane commercialPlane = new CommercialPlane();

        fighterPlane.setManufacturer("Raytheon");
        fighterPlane.setId("F-35");
        fighterPlane.increaseAltitude(100);
        fighterPlane.checkStatus();

        System.out.println("");

        cargoPlane.setManufacturer("Antonov");
        cargoPlane.setId("Antonov 500");
        cargoPlane.increaseAltitude(100);
        cargoPlane.decreaseAltitude(50);
        cargoPlane.checkStatus();

        System.out.println("");

        commercialPlane.setManufacturer("Airbus");
        commercialPlane.setId("A380");
        commercialPlane.increaseAltitude(10);
        commercialPlane.increaseAltitude(20);
        commercialPlane.checkStatus();

    }

}
