import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 256; i++)
        {
            System.out.println(i +"\t" + (char)i);
        }
        System.out.println();
        /////////////////////////////////////////////////////////////////
        System.out.println("Введите десятичное число ");
        Scanner kb = new Scanner(System.in);
        int decimal = kb.nextInt();
        int[] bin = new int[32];
        int i = 0;
        /*while (decimal > 0)
        {
            bin[i++] = decimal % 2;
            decimal /= 2;
           // i++;
        }*/
        for (; decimal > 0; decimal /= 2)
            bin[i++] = decimal % 2;
        //System.out.println(Arrays.toString(bin));
        //i--;  // Максимальный номер разряда на 1 меньше количества
        for (i--;i>=0;i--)
        {
            System.out.print(bin[i]);
        }
        char [] hex = new char [8];
        System.out.println(" Введите десятичное число ");
        decimal = kb.nextInt();
        i = 0;
        for (; decimal > 0; decimal /= 16, i++)
        {
            hex[i] = (char) (decimal % 16);
            /*if (hex[i] < 10) hex[i] += 48;
            else             hex [i]+= 55;*/
//            hex [i] = (char) (hex[i]<10 ? hex[i]+48 : hex[i]+55);
            hex[i] += hex [i] <10 ? 48 : 55;

        }
        for (--i; i >= 0; i--) System.out.print(hex[i]);


    }
}