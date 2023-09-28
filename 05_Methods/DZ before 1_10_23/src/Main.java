import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main (String[] args)
    {
        Scanner kb = new Scanner(System.in);
        /*System.out.print("Введите число: ");
        int n = kb.nextInt();
        for (int i = 0; i <= n ; i++)

            System.out.printf("%d! = %e\n", i, factorial(i));*/

        //System.out.println("Факториал " + n + " равен " + factorial(n));

        /*System.out.print("Введите положительную степень числа: ");
        int powValue = kb.nextInt();
        System.out.println(n + " в степени " + powValue + " равно " + power(n,powValue));*/
        /*System.out.print("Введите основание степени: ");
        int a = kb.nextInt();
        System.out.print("Введите показатель степени: ");
        int powValue = kb.nextInt();
        System.out.println("%d ^ %d = %f".formatted(a, powValue, power(a, powValue)));*/
        System.out.print("Введите предельное число: ");
        int n = kb.nextInt();
        Fibonachi(n, 0, 1);
    }

    static  double factorial( int n)
    {
        /*if (n < 0) return 0;
        if (n == 0)
        {
            return 1;
        }
        else
        {
            return n * factorial(n - 1);
        }*/
        return  n < 0 ? 0 : n == 1 ? 1 : n * factorial(n-1);
    }
     static double power(double a, int powValue)
    {
       /* if (powValue == 0)
        {
            return 1;
        }
           else if(powValue > 0) return a * power(a, powValue - 1);
           else return 1 / a * power(a, powValue + 1);*/
        // Три варианта написания вывода:
       // return  powValue == 0 ? 1 : powValue > 0 ? a * power(a, powValue - 1) : 1 / a * power(a, powValue + 1);
        return  powValue == 0 ? 1 : powValue > 0 ? a * power(a, powValue - 1) : 1 / power(a, -powValue); // разобраться как работает с -powValue...
       // return  powValue == 0 ? 1 : powValue > 0 ? a * power(a, powValue - 1) : 1 / power(a, Math.abs(powValue)); // через абсолютное значение, когда неизвестен знак числа

    }
    static void Fibonachi(long n, long a, long b)
    {
        if(a > n) return;
        System.out.print(a + "\t");
        Fibonachi(n, b, a + b);
    }



}