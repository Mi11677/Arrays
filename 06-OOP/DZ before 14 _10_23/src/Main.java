public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Fraction");

        // Написать класс 'Fraction', описывающий простую дробь.

        int numerator   = 6;
        int denominator = 7;
        System.out.println("Числитель= " + numerator  + "   знаменатель= " + denominator);
        Fraction fraction = new Fraction(numerator, denominator);
        System.out.println("Дробь = " + fraction);

    }
}