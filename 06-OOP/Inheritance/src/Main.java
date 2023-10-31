/*
import java.io.File;

public class Main {
    public static void main(String[] args) {
      */
/*  System.out.println("Hello inheritance!");

    Human tommy = new Human("Vercetti", "Tomas", 30);
        System.out.println(tommy);

    Student student = new Student("Pinkmann", "Jessie", 25,"Chemistry","WW_220", 90,95)  ;
        System.out.println(student);

        Teacher teacher = new Teacher( "White", "Walter", 50, "Chemistry", 25);
        System.out.println(teacher);
        Graduate graduate = new Graduate
                ("Schreder", "Hank", 40,
                        "Criminalistic", "OBN", 70, 50,
                        "How to catch Heisenberg");
        System.out.println(graduate);

        Student student1 = new Student(tommy, "Theft", "Vice", 90,98);
        System.out.println(student1);

        Specialist hank = new Specialist(graduate, 3);
        System.out.println(hank );*//*

        Specialist leo = new Specialist("Rosenberg", "Ken", 35, "Lower", "Vice", 35, 22, "NO money - no honey", 3);
        Human[] group = new Human[]
                {
                        new Student("Pinkmann", "Jessie", 25, "Chemistry", "WW_220", 90, 95),
                        new Teacher("White", "Walter", 50, "Chemistry", 25),
                        new Graduate("Schreder", "Hank", 40, "Criminalistic", "OBN", 70, 50, "How to catch Heisenberg"),
                        new Specialist("Vercetti", "Tommy", 30, "Theft", "Vice", 98, 99, "Get money back", 5),
                        new Teacher("Diaz", "Ricardo", 50, "Weapons Distribution", 20),
                        leo
                };

       */
/* //Override методы выполняют Specialization
        //Downcast - преобразование базового объекта в дочерний класс
        for(int i = 0; i < group.length; i++)
        {
            System.out.println(((Object) group[i]).getSimleName() + ":\t" + group[i].toString() + ";";
        }

        File file = new File("group.txt");
        System.out.println(file.getAbsoluteFile());
        file.delete();
        file.createNewFile();

        FileWriter writer = new FileWriter(file);

        for(int i = 0 ; i < group.length; i++)
        {
            writer.write(((Object)group[i].toString());
            writer.write('\n');
        }

        writer.close(); //Потоки обязательно нужно закрывать
*//*

    }
}*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        //Inheritance:
        /*Human tommy = new Human("Vercetti", "Tomas", 30);
        System.out.println(tommy);

        Student student = new Student("Pinkman", "Jessie", 25, "Chemistry", "WW_220", 90, 95);
        System.out.println(student);

        Teacher teacher = new Teacher("White", "Walter", 50, "Chemistry", 25);
        System.out.println(teacher);

        Graduate graduate = new Graduate(
                        "Schreder", "Hank", 40,
                        "Criminalistic", "OBN", 70, 50,
                        "How to catch Heisenberg"
                        );
        System.out.println(graduate);

        Student student1 = new Student(tommy, "Theft", "Vice", 90, 98);
        System.out.println(student1);

        Specialist hank = new Specialist(graduate, 3);
        System.out.println(hank);*/

        //Polymorphism:
        //Ad-hoc polymorphism

        //upcast - преобразование дочернего объекта в базовый.
        //Generalisation - обобщение объектов.


       /* Specialist leo = new Specialist("Rosenberg", "Ken", 35, "Lower", "Vice", 35, 22, "No money - no honey", 3);
        Human[] group = new Human[]
                {
                        new Student("Pinkman", "Jessie", 25, "Chemistry", "WW_220", 90, 95),
                        new Teacher("White", "Walter", 50, "Chemistry", 25),
                        new Graduate("Schreder", "Hank", 40, "Criminalistic", "OBN", 70, 50, "How to catch Heisenberg"),
                        new Specialist("Vercetti", "Tommy", 30, "Theft", "Vice", 98, 99, "Get money back", 5),
                        new Teacher("Diaz", "Ricardo", 50, "Weapons distribution", 20),
                        leo
                };

        //Override методы выполняют Specialization
        //Downcast - преобразование базового объекта в дочерний класс
        for(int i = 0; i < group.length; i++)
        {
            System.out.println(((Object)group[i]).getClass().getSimpleName() + ":\t" + group[i] + ";");
        }

        save(group, "group.txt");*/
        load("group.txt");
    }
    public static void save(Human[] group, String filename)throws IOException
    {
        File file = new File(filename);
        System.out.println(file.getAbsoluteFile());
        file.delete();
        file.createNewFile();

        FileWriter writer = new FileWriter(file);

        for(int i = 0 ; i < group.length; i++)
        {
            writer.write(((Object)group[i]).getClass().getSimpleName() + ":\t" + group[i].toString() + ";");
            writer.write('\n');
        }
        writer.close(); //Потоки обязательно нужно закрывать

        String command = "C:\\Program Files\\Notepad++\\notepad++ " + filename;

        Process process = Runtime.getRuntime().exec(command);
    }
    public static Human[] load(String filename) throws FileNotFoundException
    {
        //Human[] group = null;
        ArrayList<Human> al_group = new ArrayList<>();
        File file = new File(filename);
        Scanner scanner = new Scanner(file); //Создаём и открываем поток чтения из файла
        while (scanner.hasNextLine())
        {
            String buffer = scanner.nextLine();
            String[] values = buffer.split("[:,;]");

            //System.out.println(buffer);
           /* al_group.add(HumanFactory.Create(values[0]));
            al_group.get(al_group.size() - 1).init(values);

            for (int i = 0; i < values.length; i++) {
                System.out.print(values[i] + "\t");

            }*/
           Human member = HumanFactory.Create(values[0]);
            member.init(values);

            // System.out.println(((Object) member).getClass().getSimpleName());

        }
        scanner.close(); // Закрываем поток
        Human[] group = new Human[al_group.size()];
        return al_group.toArray(group);
    }
}