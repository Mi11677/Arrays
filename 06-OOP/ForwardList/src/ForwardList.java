public class ForwardList<T>
{
    Element<T> Head;
    int size;
    public ForwardList()
    {
        this.Head = null;
        size = 0;
        System.out.println("LConstructor:\t" + Integer.toHexString(this.hashCode()));
    }

    ForwardList(ForwardList<T> other)
    {
        System.out.println("LCopyConstractor: " + Integer.toHexString(hashCode()));

        /*this.Head = other.Head;  //  Shallow copy -- поверхностное копирование
        this.size = other.size;*/
        for (Element<T> Temp = other.Head; Temp != null; Temp = Temp.getNext())
            this.push_front(Temp.getData());
        reverse();
    }
    public void reverse()
    {
        ForwardList<T> reverse = new ForwardList<T>();
        while (Head != null)
        {
            reverse.push_front(Head.Data);
            pop_front();
        }
        this.Head = reverse.Head;
        reverse.Head = null;
    }

    public void push_front(T Data)  // начало списка
    {
        /*Element New = new Element(Data);
        New.setNext(Head);
        Head = New;*/
        Head = new Element(Data, Head);
        size++;
    }
    public void push_back(T Data)   //  добавляет значение в конец списка
    {
        if (Head == null)
        {
            push_front(Data);
            return;                  //  без return функция отработает дважды
                                     // и запишет первое значение два раза
        }
        Element<T> Temp = Head;
        while (Temp.getNext() != null )Temp = Temp.getNext();  // 1 Доходим до конца списка

        Temp.setNext(new Element(Data)); // 2 Добавляем элемент в конец списка
        size++;
    }

    void insert(T Data, int Index)
    {
       if (Index == 0)
       {
           push_front(Data);
           return;
       }
       if (Index > size)return;
        Element<T> Temp = Head;
        for (int i = 0; i < Index - 1; i++)Temp = Temp.getNext();

            /*Element New = new Element(Data);
            New.setNext(Temp.getNext());
            Temp.setNext(New);*/
            Temp.setNext(new Element(Data, Temp.getNext()));
            size++;
    }



    public void pop_front()  //  удаляет началный элемент списка
    {
        Head = Head.getNext();
        size--;
    }

    public void  pop_back()   //  удаляет последний элемент списка
    {
        Element<T> Temp = Head;
        while (Temp.getNext().getNext() != null)Temp = Temp.getNext(); // вызываем  два раза getNext()
                                                                       // оказываемся на предпоследнем элементе
        Temp.setNext(null);
        size--;
    }


    public void print()  // заполняем список
    {
        Element<T> Temp = Head;  // Temp - итератор или указатель, при помощи котрого можно получить доступ к началу списка
        while (Temp != null)
        {
            System.out.print(Temp.getData() + "\t");
            Temp = Temp.getNext();
        }
        System.out.println();
    }
}
