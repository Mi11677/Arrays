import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // System.out.print("Hello world!");
        //main( null);

        Scanner kb = new Scanner(System.in);
        System.out.print("Ведите номер этажа: ");
        int floor = kb.nextInt();
        Elevator(floor);
    }
        static void  Elevator(int floor)
        {
            if (floor == 0)
            {
                System.out.println("Вы в подвале");
                return;
            }
            System.out.println("Вы на " + floor +"этаже");
            Elevator(floor-1);
            System.out.println("Вы на " + floor +"этаже");
        }
}