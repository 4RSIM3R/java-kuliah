package s3.w3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private int id;
    private String name;
    private String address;
    private String room;

    public void showInfo() {
        System.out.printf("NIM : %d \n", id);
        System.out.printf("Name : %s \n", name);
        System.out.printf("Address : %s \n", address);
        System.out.printf("Room : %s \n", room);
    }

}
