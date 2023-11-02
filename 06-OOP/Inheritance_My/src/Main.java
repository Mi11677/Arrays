import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


public class Main {
    public static void main(String[] args) throws IOException {

     /*   // TODO:
        //В проект 'Inheritance' добавить классы
        //    'Specialist' - дипломник, который защитил проект; (разобрали на уроке)
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

        Specialist hank = new Specialist(graduate, 3);
        System.out.println(hank);

        Bookkeper bookkeper = new Bookkeper("Lloyd", "Dana", 45, 10);
        System.out.println(bookkeper);

        Master master = new Master("Black", "Tomas", 50, "Chemistry", 25, "Doctor of Sciences");
        System.out.println(master);
*/


    Specialist leo = new Specialist("Rosenberg", "Ken", 35, "Lower", "Vice", 35, 22, "Get money", 3);
   Human[] group = new Human[]
           {
                   new Student("Pinkman", "Jessie", 25, "Chemistry", "WW_220", 90, 95),
                   new Teacher("White", "Walter", 50, "Chemistry", 25),
                   new Graduate("Schreder", "Hank", 40, "Criminalistic", "OBN", 70, 50, "How to catch Heisenberg"),
                   new Specialist("Vercetti", "Tommy", 30, "Theft", "Vice", 98, 99, "Get money back", 5),
                   new Teacher("Diaz", "Ricardo", 50, "Weapons distribution", 20),
                   leo

           };

   for (int i = 0; i < group.length; i++) {
            System.out.println(group[i]);
        }


   File file = new File("group.txt");
   System.out.println(file.getAbsoluteFile());
   file.delete();
   file.createNewFile();

   FileWriter writer = new FileWriter(file);
        for (int i = 0; i < group.length; i++) {
            writer.write(group[i].toString() + "\n");
        }

   writer.close();   // Потоки обязательно нужно закрывать


        /*if (file.createNewFile())                           // Второй вариант создания файла (с выводом сообщения)
                                                              // в функции идет одновременно создание файла
                                                              //и проверка его наличия

        {
            System.out.println("File created");
        }
        else
        {
            System.out.println("File exists");
        }*/


    }
}