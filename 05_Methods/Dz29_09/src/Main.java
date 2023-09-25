import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = kb.nextInt();
        int[] arr = new int[n];
        Rand_arr(arr);
        Print_arr(arr);
        System.out.println("Сумма элементов массива равна: " + Sum(arr));
        System.out.println("Средне-фрифметическое значение элементов массива равно: " + Avg(arr));
        System.out.println("Минимальное значение элементов массива равно: " + MinValueIn);
        System.out.println("Максимальное значение элемента массива равно: " + MaxValueIn);

    }

    static void ShiftLeft(int[] arr, int n)
    {
        for (int i = 0; i < n; i++)
        int tmp = arr[0];
        {
            for (int j = 0; j < arr.length - 1; j++)
            {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = tmp;
        }
    }



    static  int Sum(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
        }
        return sum;
    }
    static double Avg (int[] arr)
    {
        double avg = Sum(arr) / (double) arr.length;
        return avg;
    }
    static int MinValueIn(int[] arr)
    {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length ; i++)
        {
         if (arr[i] < min)
         {
             min = arr[i];
         }
        }
        return min;
    }
    static  int MaxValueIn(int[] arr)
    {
        int max = Integer.
    }
    static void Print_arr(int[] arr)
    {

    }
}
