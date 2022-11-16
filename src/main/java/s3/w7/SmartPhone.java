package s3.w7;

import lombok.Data;

@Data
public abstract class SmartPhone extends Phone {

    private String ipAddress;

    @Override
    void startCall() {
        System.out.printf("Calling : %s \n", this.getPhoneNumber());
    }

    @Override
    void endCall() {
        System.out.printf("End Call : %s \n", this.getPhoneNumber());
    }

    abstract void playMusic();

}
