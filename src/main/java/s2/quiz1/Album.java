package s2.quiz1;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data // this will generate all setter and getter for all fields
@AllArgsConstructor // this will generate an all-args constructor
@NoArgsConstructor // this is equivalent of writing no-args constructor
@ToString // will generate toString()
// Comparable<Album> that implemented here is for make this object can Compare to another object using `Collections.sort()`
// Bye, bye looping, welcome declarative programming
public class Album implements Comparable<Album> {

    private String title;
    private String artist;
    private int total;
    private int price;

    public void showData() {
        System.out.printf("Title : %s \n", title);
        System.out.printf("Artist : %s \n", artist);
        System.out.printf("Total : %d \n", total);
        System.out.printf("Price : %d \n", price);
        System.out.printf("Sale : %d \n", (total * price));
    }

    public int calculateSale() {
        return total * price;
    }


    // this rules is for descending sort
    @Override
    public int compareTo(Album o) {
        return o.calculateSale() - this.calculateSale();
    }
}
