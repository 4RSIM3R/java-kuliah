package s3.w8;

import lombok.Data;

@Data
public class Trapezoid extends TwoDimensionalFigure implements ICircumference, ISimetric {

    private double base;
    private double height;

    @Override
    public double calculateCircumference() {
        return 0;
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
        return (base * height) / 2;
    }
}
