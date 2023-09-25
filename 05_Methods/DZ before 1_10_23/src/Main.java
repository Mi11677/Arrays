import java.util.Scanner;

public class Main {
    public static void main (String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = kb.nextInt();
        System.out.println("Факториал " + n + " равен " + factorial(n));

        System.out.print("Введите положительную степень числа: ");
        int powValue = kb.nextInt();
        System.out.println(n + " в степени " + powValue + " равно " + power(n,powValue));

    }
    static int factorial(int n)
    {
        if (n == 1)
        {
            return 1;
        }
        else
        {
            return n * factorial(n - 1);
        }
    }
     static int power(int n, int powValue)
    {
        if (powValue == 1)
        {
            return n;
        }
        else
        {
            return n * power(n, powValue - 1);
        }
    }
     /*static int Fibonachi(int n)
     {

        if (n == 0 || n == 1)
        {
            return n;
        }

        return Fibonachi(n - 1) + Fibonachi(n - 2);
    }*/

}