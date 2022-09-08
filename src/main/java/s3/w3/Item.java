package s3.w3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    private int stock;
    private String name, type;

    public void showInfo() {
        System.out.printf("NIM : %d \n", stock);
        System.out.printf("Name : %s \n", name);
        System.out.printf("Type : %s \n", type);
    }

    public int addStock(int payload) {
        stock += payload;
        return stock;
    }

}
