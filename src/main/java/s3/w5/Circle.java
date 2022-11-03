package s3.w5;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle extends TwoDimensionalFigure {

    private final float radius;

    public float getTotalArea() {
        return (float) (3.14 * radius * radius);
    }

    public float getTotalPerimeter() {
        return (float) (2 * 3.14 * radius);
    }

    public void info() {
        super.info(this.getClass().getSimpleName());
    }
}
