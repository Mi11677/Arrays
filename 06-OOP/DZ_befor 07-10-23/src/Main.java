import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Point");

        Point A = new Point();
        A.setX(2);
        A.setY(3);

        Point B = new Point();  // Классический прямоугольный треугольник 3,4,5
        B.setX(5);
        B.setY(7);

        A.Print();
        B.Print();
        System.out.println("Расстояние до указанной точки: " + A.distance(B));
        System.out.println("Расстояние между двумя точками " + Point.distance(A, B));

    }
}
class  Point {
    private double x;
    private double y;

    public double getX() {        return x;    }

    public double getY() {        return y;    }

    public void setX(double x) {        this.x = x;    }

    public void setY(double y) {        this.y = y;    }

    double distance(Point current) {
        double x_cachet = this.x - current.x;
        double y_cachet = this.y - current.y;
        return Math.sqrt(x_cachet * x_cachet + y_cachet * y_cachet);
    }

    public static double distance(Point A, Point B) {
        double x_cachet = A.x - B.x;
        double y_cachet = A.y - B.y;
        return Math.sqrt(x_cachet * x_cachet + y_cachet * y_cachet);

    }

    public void Print()
    {
        System.out.println("X= %f, Y= %f".formatted(x, y));
    }



}