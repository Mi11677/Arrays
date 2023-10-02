public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Point A = new Point();
        A.x = 2;
        A.y = 3;
        System.out.println("X = " + A.x);
        System.out.println("Y = " + A.y);
    }
}

class Point
{
    double x;
    double y;
}