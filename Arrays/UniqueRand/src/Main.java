import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 10 ;
        int []arr= new int[n];
        Random rand = new Random(0);
        for (int i = 0; i < n; i++)
        {
           /* arr [i] = rand.nextInt(n);  // Второй способ генерации случайных уникальных чисел.
            for (int j = 0; j < i; j++ )
            {
                if(arr[i]==arr[j])
                {
                    i--;
                    break;
                }
            }*/
           boolean unique;
            do
            {
                arr[i] = rand.nextInt(n);
                unique = true;  //Предположим, что сгенерировалось уникальное случайное число,
                // но это нужно проверить:
                for (int j = 0; j < i; j++)
                {
                   if (arr[i] == arr[j])
                    {
                        unique = false;
                        break;
                    }
                }

            }while (!unique);


        }
        System.out.println(Arrays.toString(arr));

    }
}