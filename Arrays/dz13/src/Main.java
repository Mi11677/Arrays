import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
 // задание 1. Создаем массив и заполняем его элементами.
        System.out.print("Введите размер массива (от 2 до 25): ");
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i=0; i <n; i++)
        {
            System.out.print("Введите элемент массива (от 0 до 1000): ");
            arr[i] = kb.nextInt();
        }

// задание 2. Выводим элементы массива в строку.
        System.out.println(" Элементы массива");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

// задание 3. Выводим элементы массива в обратном порядке.
        System.out.println(" Элементы массива в обратном порядке");
        for ( int i = arr.length - 1; i >= 0; i--)
        {

            System.out.print(arr[i] + " ");
        }
        System.out.println();

// задание 4. Вычисляем сумму элементов массива.
        System.out.print("Сумма элементов массива = ");
        int sum=0;
        for (int i = 0; i < n; i++)
        {
            sum = sum + arr[i];
        }
        System.out.print(sum);
        System.out.println();

// задание 5. Вычислить средне-арифметическое элементов массива.
        System.out.print("Средне-арифметическое значение элементов массива = " + (double) sum / n);
        System.out.println();

// задача 6

     int min , max;
     min=max=0;
     for (int i = 0; i < n; i++)
     {
         if (arr[i] < min) min = arr[i];
         if (arr[i] > max) max = arr[i];
     }
        System.out.println("Минимальное" + min);
        System.out.println("Максимальное" + max);

// альтернатива
        System.out.println("сумма элементов" + IntStream.of(arr).sum());
        System.out.println("Среднее-арифметическое" + IntStream.of(arr).average().getAsDouble());
        System.out.println("Минимальное " + IntStream.of(arr).min().getAsInt());
        System.out.println("Максимальное");



     }


    }
