public class Master extends Teacher{
    private String academicDegree; // учёная степень - доктор наук (Doctor of Sciences)

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public Master(String lastName, String firstName, int age,
                  String speciality, int experience,
                  String academicDegree)
        {
            super(lastName, firstName, age, speciality, experience);
            setAcademicDegree(academicDegree);
            System.out.println("MConstructor\t" + Integer.toHexString(hashCode()));
        }

    public String toString()
    {
        return super.toString() + " " + academicDegree;
    }
}
