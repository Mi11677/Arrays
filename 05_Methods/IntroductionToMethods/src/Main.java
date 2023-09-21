import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Введите два числа: ");
        int a = kb.nextInt();
        int b = kb.nextInt();

        int c = Math.Sum(a, b);
        System.out.println("%d + %d = %d".formatted(a, b, c));
        System.out.println("%d - %d = %d".formatted(a, b, Math.Diff(a, b)));
        System.out.println("%d * %d = %d".formatted(a, b, Math.Prod(a, b)));
        System.out.println("%d / %d = %f".formatted(a, b, Math.Quot(a, b)));
        System.out.println("%f ^ %d = %f".formatted((double)a, b, Math.Power(a, b)));

        System.out.print("Введите число: ");
        int n = kb.nextInt();
        System.out.println("%d! = %d".formatted( n, Math.Factorial(n)));
    }

}

class Math {
    static int Sum(int a, int b) {
        int c = a + b;
        return c;
    }

    static int Diff(int a, int b) {
        return a - b;
    }

    static int Prod(int a, int b) {
        return a * b;
    }

    static double Quot(int a, int b) {
        return (double) a / b;
    }

    static int Factorial(int n)
    {
        int f = 1;
        for (int i = 1; i <= n; i++)
        {
            f *= i;
        }
        return  f;
    }
    static double Power(double a, int n)


    {
        double N = 1;
        if (n < 0)
        {
            a = 1/a;
            n = -n;
        }
        for (int i = 0; i < n; i++)
        {
            N *= a;
        }
        return N;
    }


}
