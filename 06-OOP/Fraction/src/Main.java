public class Main {
    public static void main(String[] args) {
   //     System.out.println("Hello Constructor");

        /*Fraction A = new Fraction();
        A.print();
        System.out.println(A.getDenominator());

        Fraction B = new Fraction(5);
        B.print();

        Fraction C = new Fraction(1, 2);
        C.print();

        Fraction D = new Fraction(2,3,4);
        D.print();

        Fraction E = new Fraction(D);
        E.print();*/


        Fraction A = new Fraction(2,3,4);

        Fraction B = new Fraction(3,4,5);

        Fraction C =  Fraction.mul(A, B);
        A.print();
        B.print();
        C.print();
        System.out.println(C);
    }
}