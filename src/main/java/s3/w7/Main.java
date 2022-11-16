package s3.w7;

public class Main {

    public static void main(String[] args) {

        AndroidPhone androidPhone = new AndroidPhone();
        androidPhone.setPhoneNumber("081217141850");
        androidPhone.setIpAddress("192.168.1.10");

        androidPhone.startCall();
        androidPhone.endCall();

        androidPhone.playMusic();

    }

}
