import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Random rand = new Random(0);
        int rows = 7;
        int cols = 10;
        int[][] arr = new int[rows][cols];
        System.out.println("Start");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                boolean unique ;
                do {
                    unique = true;
                    arr[i][j] = rand.nextInt(rows * cols);
                    for (int k = 0; k <= i; k++)
                    {
                        for (int l = 0; l < (k == i ? j : arr[k].length); l++)
                        {
                            if(arr[i][j] == arr[k][l])
                            {
                                unique = false;
                                break;
                            }
                        }
                        if (!unique)break;
                    }
                }
                while (!unique);
            }
        }
      for (int i = 0; i < arr.length; i++)
          System.out.println(Arrays.toString(arr[i]));

    }
}