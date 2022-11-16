package s3.w7;

import lombok.Data;

@Data
public abstract class Phone {

    private String phoneNumber;

    abstract void startCall();
    abstract void endCall();

}
