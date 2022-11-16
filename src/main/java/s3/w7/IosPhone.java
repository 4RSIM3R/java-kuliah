package s3.w7;

import lombok.Data;

@Data
public class IosPhone extends SmartPhone {

    private String version;

    @Override
    void playMusic() {

        System.out.println("Playing Music In Ios");

    }

}
