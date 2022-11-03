package s3.w5;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle extends TwoDimensionalFigure {

    private final float length;
    private final float wide;

    public float getTotalArea() {
        return length * wide;
    }

    public float getTotalPerimeter() {
        return 2 * (length + wide);
    }


    public void info() {
        super.info(this.getClass().getSimpleName());
    }
}
