public class Fraction {
   private int integer;    //целая часть
    private int numerator;  //числитель
    private int denominator;// знаменатель


    //              Encapsulation

    public int getInteger()
    {
        return integer;
    }

    public int getNumerator()
    {
        return numerator;
    }

    public int getDenominator()
    {
        return denominator;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if(denominator == 0) denominator = 1;
        this.denominator = denominator;
    }

    //                      Constructors:
    public Fraction ()
    {
        setDenominator(1);
        System.out.println("DefaultConstructor:" + Integer.toHexString(this.hashCode()));
    }
    public Fraction(int integer)
    {
        setInteger(integer);
        setNumerator(0);
        setDenominator(1);
        System.out.println("1ArgConstructor:\t" + this.hashCode());
    }

    public Fraction(int numerator, int denominator)
    {
        setInteger(0);
        setNumerator(numerator);
        setDenominator(denominator);
        System.out.println("Constructor:\t\t" + hashCode());
    }

    public Fraction (int integer, int numerator , int denominator)
    {
        setInteger(integer);
        setNumerator(numerator);
        setDenominator(denominator);
        System.out.println("Constructor:\t\t" + hashCode());
    }

    public Fraction(Fraction other)
    {
        this.integer = other.integer;
        this.numerator = other.numerator;
        this.denominator = other.denominator;
        System.out.println("CopyConstructor:\t"  + hashCode());
    }


    //                  Arithmetics:

     public static Fraction mul(Fraction l_value, Fraction r_value)
     {
        Fraction left = new Fraction(l_value);
        Fraction right = new Fraction(r_value);
        //---------------------------//

         left.toImproper();
         right.toImproper();
         /*Fraction result = new Fraction();
         result.setNumerator(left.numerator * right.numerator);
         result.setDenominator(left.denominator * right.denominator);
         result.toProper();
         return result;*/
        /* Fraction result = new Fraction(left.numerator * right.numerator,
                 left.denominator* right.denominator);
         result.toProper();
         return result;  */
         return new Fraction(

             left.numerator * right.numerator,
             left.denominator*right.denominator).toProper();
     }
     public static Fraction div(Fraction l_value, ) 


    //                      Methods


    // Умножение

    Fraction toImproper()
    {
        numerator+= integer*denominator;
        integer = 0;
        return this;
    }
    Fraction toProper()
    {
        integer+= numerator/denominator;
        numerator %=denominator;
        return this;  // Возвращаем измененный объект
    }

    public void print()
    {
        if (integer != 0) System.out.print(integer);
        if (numerator!= 0)
        {
            if(integer != 0) System.out.print("(");
            System.out.print(numerator + "/" + denominator);
            if (integer != 0) System.out.print(")");
        }
        else  if (integer == 0) System.out.print(0);
        System.out.println();
    }


}

