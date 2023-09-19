import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Введите количество строк: ");
        int rows = kb.nextInt();
        System.out.print("Введите количество элементов строки: ");
        int cols = kb.nextInt();

        int[][] arr = new int[rows][cols];

        Random rand = new Random(0);
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols;j++ )
            {
                arr[i][j] = rand.nextInt(100);
            }
        }
        System.out.println("Кличество строк: " + arr.length);
        System.out.println("Количество элементов строки: " + arr[0].length);

        for (int i = 0; i < arr.length; i++ )
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n--------------------------------------------------\n");
        int interations = 0;
        int exhages = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = i; k < arr.length; k++) {
                    for (int l = k==i? j : 0; l < arr[k].length; l++) {
                        //arr[i][j] - выбранный элемент
                        //arr[k][l] - перебираемый элемент
                       interations++;
                        if (arr[k][l] < arr[i][j]) {
                            int buffer = arr[i][j];
                            arr[i][j] = arr[k][l];
                            arr[k][l] = buffer;
                            exhages++;
                        }
                    }
                }
            }
        }
        System.out.println("Массив отсортирован за %d итераций, при этом было сделано %d замен элементов".formatted(interations,exhages));
        for (int i = 0; i < arr.length; i++)   System.out.println(Arrays.toString(arr[i]));



    }
}