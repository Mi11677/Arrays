public class Main {
    public static void main(String[] args) {

        // TODO:
        //В проект 'Inheritance' добавить классы
        //    'Specialist' - дипломник, который защитил проект;
        //    'Bookkeper'  - бухгалтер;
        //    'Master'     - заведующий кафедрой;

        System.out.println("Hello Inheritance!");

        Human tommy = new Human("Vercetti", "Tomas", 30);
        System.out.println(tommy);

        Student student = new Student("Pinkman", "Jessie", 25, "Chemistry", "WW220", 90, 95);
        System.out.println(student);

        Teacher teacher = new Teacher("White", "Walter", 50, "Chemistry", 25);
        System.out.println(teacher);

        Graduate graduate = new Graduate("Schreder", "Hank", 40,
                "Criminalistic", "OBD", 70, 50,
                "How to catch Heisenberg");
        System.out.println(graduate);

        Student student1 = new Student(tommy, "Theft", "Vice", 90, 98);
        System.out.println(student1);
    }
}