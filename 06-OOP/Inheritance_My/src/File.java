import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class File
{
    private String filename;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public File(String filename) {
        setFilename(filename);
    }
    public  void save(Human[] group/*, String filename*/)throws IOException
    {
        java.io.File file = new java.io.File(filename);
        System.out.println(file.getAbsoluteFile());
        file.delete();
        file.createNewFile();

        FileWriter writer = new FileWriter(file);

        for (int i = 0; i < group.length; i++)
        {
            writer.write(((Object)group[i]).getClass().getSimpleName() + ":\t" + group[i].toString() + ";");
            writer.write("\n");
        }
        writer.close();   // Потоки обязательно нужно закрывать

        String command = "C:\\Program Files\\Notepad++\\notepad++ " + filename;

        Process process = Runtime.getRuntime().exec(command);
    }
    public  Human[] load(/*String filename*/) throws FileNotFoundException
    {
        // Human[] group = null;\
        ArrayList<Human> al_group = new ArrayList<>();
        java.io.File file = new java.io.File(filename);
        Scanner scanner = new Scanner(file);       // Создаём и открываем поток чтения из файла
        while (scanner.hasNextLine())
        {
            String buffer = scanner.nextLine();
            if (buffer.isEmpty())continue;
            String[] values = buffer.split("[:,;]");
            values[1] = values[1].replace("\t", "");
            for (int i = 0; i < values.length; i++)values[i].trim();
            //System.out.println(buffer);
            /*System.out.print(values.length + ":\t");
            for (int i= 0; i < values.length; i++) System.out.print(values[i] + "\t");
            System.out.println();*/
            Human member = HumanFactory.Create(values[0]);
            member.init(values);
            // System.out.println(((Object) member).getClass().getSimpleName());
            // al_group.add(HumanFactory.Create(values[0]));
            // al_group.get(al_group.size() - 1).init(values);
            al_group.add(member);

        }
        scanner.close();        //  Закрываем поток
        Human[] group = new Human[al_group.size()];
        System.out.println(al_group.size());
        return al_group.toArray(group);
    }

}
