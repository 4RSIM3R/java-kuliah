package s3.w8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rectangle extends TwoDimensionalFigure implements ISimetric, ICircumference {

    double side;

    @Override
    public double calculateCircumference() {
        return 4 * side;
    }

    @Override
    public double rotate() {
        return 0;
    }

    @Override
    public double fold() {
        return 0;
    }

    @Override
    public double calcArea() {
        return side * side;
    }
}
