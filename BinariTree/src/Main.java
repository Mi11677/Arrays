import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Tree!");

        Scanner kb = new Scanner(System.in);
        Random rand = new Random(0);
        System.out.print("Введите размер дерева: ");
        int n = kb.nextInt();
        Tree tree = new Tree();
        for (int i = 0; i < n; i++) {
            tree.insert(rand.nextInt(100), tree.getRoot());
        }

        tree.print(tree.getRoot());
        System.out.println();
        System.out.println("Минимальное значение в дереве: "  + tree.minValue(tree.getRoot()));
        System.out.println("Максимальное значение в дереве: " + tree.maxValue(tree.getRoot()));
        System.out.println("Сумма элементов в дереве: "       + tree.sum(tree.getRoot()));


    }
}