package s3.w7;

import lombok.Data;

@Data
public class AndroidPhone extends SmartPhone {

    private String version;

    @Override
    void playMusic() {
        System.out.println("Playing Music In Android");
    }
}
