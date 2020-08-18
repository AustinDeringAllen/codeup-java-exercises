package shapes;

public class Square extends Quadrilateral {

    public Square(int side) {
        super(side, side);
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * getLength() + 2 * getWidth();
    }

    @Override
    public double getArea() {
        return getLength() * getWidth();
    }
}
