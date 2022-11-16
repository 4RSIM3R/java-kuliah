package s3.w7;

public class MobilePhone extends Phone {


    @Override
    void startCall() {
        System.out.printf("Dialing Call :  %s \n", this.getPhoneNumber());
    }

    @Override
    void endCall() {
        System.out.printf("Ending Call : %s \n", this.getPhoneNumber());
    }
}
