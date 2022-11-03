package s3.w4;

public class Main {

    public static void main(String[] args) {
       Encapsulation encapsulation = new Encapsulation();
       encapsulation.setName("James");
        try {
            encapsulation.setAge(75);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        System.out.println(encapsulation.toString());
    }

}
