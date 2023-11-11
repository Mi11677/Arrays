import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random(0);
        Scanner kb = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int n = kb.nextInt();

        ForwardList list = new ForwardList();
        for (int i = 0; i < n; i++)
        {
           // list.push_back(rand.nextInt(100));
            list.push_front(rand.nextInt(100));

        }
        //list.push_back(123);   //для проверки работы push_back
        //list.print();
        //  list.pop_front();  // вызываем метод pop_front (удаляем первый элемент)
       // list.pop_back();   // вызываем метод pop_back (удаляем последний элемент)

        /*System.out.print("Введите значение добавляемого элемента: ");  // Для метода insert начало
        int value = kb.nextInt();
        System.out.print("Введите индекс добавляемого элемента: ");
        int index = kb.nextInt();
        list.insert(value, index);*/                                     // окончание
        //list.print();
        long start_time = System.nanoTime();
        ForwardList list2 = new ForwardList(list);
        long end_time = System.nanoTime();
        System.out.println("Список скопировался за %f секунд.".formatted((double)(end_time - start_time)*1e-9));
        /*list2.print();
        list.pop_back();
        list.print();
        list2.print();*/


    }
}