package s3.w5;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Triangle extends TwoDimensionalFigure {

    private final float base;
    private final float height;

    public float getTotalArea() {
        return (base * height) / 2;
    }

    public float getTotalPerimeter() {
        float side = (float) Math.sqrt(Math.pow((base / 2), 2) + Math.pow(height, 2));
        return side + side + base;
    }

    public void info() {
        super.info(this.getClass().getSimpleName());
    }
}
