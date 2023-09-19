import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.stream.IntStream;
public class Main {
    public static void main(String[] args) {
        Scanner kb=new Scanner (System.in);
        int step;
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
      for ( int i = 0; i<arr.length; i++)
      {
          System.out.print(arr[i] + "\t");
      }


//  задача Сдвигаем массив влево
       System.out.print("    Введите значение для сдвига влево:");
       step= kb.nextInt();

        for (int i = 0; i < step; i++)
        {
            int var = arr[0];
            for (int j = 0; j < arr.length - 1; j++)
            {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = var;
        }

            for ( int i = 0; i<arr.length; i++) // Печатаем результат
        {
            System.out.print(arr[i] + "\t");
        }

// задача Сдвигаем массив впрво

        System.out.print("    Введите значение для сдвига вправо:");
         step= kb.nextInt();


        for (int i = 0; i < step; i++)
        {
            int var = arr[9];
            for (int j = 9; j >0; j--)
            {
                arr[j] = arr[j - 1];
            }
            arr[0] = var;
        }

        for ( int i = 0; i<arr.length; i++) // Печатаем результат
        {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

// задача Отсортировать массив в порядке возрастания
        System.out.println("Сортируем массив в порядке возрастания");

        int[] arr2 = new int[]{9, 4, 5, 7, 6, 45, 56, 8, 47 };
        System.out.println(Arrays.toString(arr2)); // Печатаем массив :)



        for (int i = 0; i < arr2.length-1; i++ )
        {
            int var=arr2[i];


           for (int j = i; j < arr2.length; j++)
           {
               if (var>arr2[j])
               {
                  arr2[i]=arr2[j]; arr2[j]=var;  var=arr2[i];
               }
           }

        }

        System.out.println(Arrays.toString(arr2));

    }
}