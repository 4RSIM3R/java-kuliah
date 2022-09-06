package s3.w1;

public class Main {

    public static void main(String[] args) {
        Car nissan = new Car();
        nissan.setMark("Nissan");
        nissan.increaseSpeed(10);
        nissan.changeGear(2);
        nissan.checkStatus();

        System.out.println("");

        Car mitsubishi = new Car();
        mitsubishi.setMark("Mitsubishi");
        mitsubishi.increaseSpeed(10);
        mitsubishi.changeGear(2);
        mitsubishi.changeGear(3);
        mitsubishi.checkStatus();

        System.out.println("");

        MaticCar maticCar = new MaticCar();
        maticCar.setMark("Hyundai");
        maticCar.increaseSpeed(10);
        maticCar.changeGear(2);
        maticCar.changeGear(3);
        maticCar.setTransmission("Matic");
        maticCar.checkStatus();

        System.out.println("");

    }

}
