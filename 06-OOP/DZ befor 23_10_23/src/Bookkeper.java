

public class Bookkeper extends Human{

    public int years; // стаж работы лет

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public Bookkeper(String lastName, String firstName, int age, int years)
            {
                super(lastName, firstName, age);
                setYears(years);
                System.out.println("BConstructor\t" + Integer.toHexString(hashCode()));
            }

    public String toString ()
    {
        return super.toString() + " " + years;
    }

}
