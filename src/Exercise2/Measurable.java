package Exercise2;

public interface Measurable {
    double getPerimeter();
    double getArea();

    default double getPerimeter(double... sides) {
        double perimeter = 0;
        for (double side : sides) {
            perimeter += side;
        }
        return perimeter;
    }
}
