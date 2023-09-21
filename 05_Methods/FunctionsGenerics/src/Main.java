import java.util.Random;
import java.util.Scanner;

public class Main<T> {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = kb.nextInt();
        Integer[] arr = new Integer[n];

        FillRand(arr);
        Print(arr);
        Sort(arr);
        Print(arr);

        Double[] brr = new Double[n];
        FillRand(brr, 0 , 100);
        Print(brr);

        Character[] c_arr = new Character[]{'H', 'e', 'l', 'l', 'o'};
        Print(c_arr);
    }
    static void FillRand(Integer[] arr)
    {
        Random rand = new Random(0);
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = rand.nextInt(100);
        }
    }
    static void FillRand(Integer[] arr, int minRand, int maxRand)
    {
        Random rand = new Random(0);
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = rand.nextInt(minRand, maxRand);
        }
    }
    static void FillRand(Double[] arr)
    {
        Random rand = new Random(0);
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = rand.nextDouble(100);
        }
    }
    static void FillRand(Double[] arr, int minRand, int maxRand)
    {
        Random rand = new Random(0);
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = rand.nextDouble(minRand, maxRand);
        }
    }
    static<T> void Print(T[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
    /*static <T> T Sum(T[] arr)
    {
        T sum = T();
        for (int )

    }*/
    static<T> void Sort(T[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                /*if(arr[j] < arr[i])
                {
                    T buffer = arr[i];
                    arr[i] = arr[j];
                    arr[j] = buffer;
                }*/
            }
        }
    }
}