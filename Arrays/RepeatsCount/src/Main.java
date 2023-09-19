import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      int n = 10;
       int[] arr = new int [n];
       Random rand = new Random(0);
       for (int i = 0; i < n; i++)
       {
           arr[i] = rand.nextInt(n/2);
       }
        System.out.println(Arrays.toString(arr));

       for (int i = 0; i < n; i++ )
       {
           // прежде чем считать повторения нужно выяснить,
           //встречался ли этот элемент в массиве ранее.
           // потому что, если он считался ранее, то
           // мы уже посчитали количество повторений для этого значения
           boolean met_before = false;
           for(int j = 0; j < i; j++)
           {
               if(arr[i] == arr[j])
               {
                   met_before = true;
                   break;
               }
           }
           if(met_before)continue;// если элемент встречался ранее,
           // то мы уже посчитали количество повторений, и вывели на экран.
           int count = 0;
           for (int j = i+1; j < n; j++)
           {
               if (arr[i] == arr[j])count++;//считаем количество повторений
           }
           if (count > 0) System.out.println("Значение %d встречается %d раз".formatted(arr[i], count ));
       }
    }
}