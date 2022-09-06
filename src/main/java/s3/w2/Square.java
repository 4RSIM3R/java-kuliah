package s3.w2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Square {

    public int side;

    public int getArea() {
        return side * side;
    }

    public int getPerimeter() {
        return 4 * side;
    }

    public void getPerimeterAndArea() {
        int area = getArea();
        int perimeter = getPerimeter();
        System.out.printf("Total Area Of Square : %d \n", area);
        System.out.printf("Total Perimeter Of Square : %d \n", perimeter);
    }

}
