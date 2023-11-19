public class Tree
{
    class Element
    {
        private int Data;
        private Element Left;
        private Element Right;
        public Element(int data) {
            Data = data;
            Left = null;
            Right = null;
            System.out.println("EConstructor:\t" + Integer.toHexString(hashCode()));
        }

        @Override
        protected void finalize()  {
      //      super.finalize();
            System.out.println("EDestructor:" + Integer.toHexString(hashCode()));

        }
    }

    private Element Root;

    public Element getRoot() {
        return Root;
    }

    public Tree()
    {
        Root = null;
        System.out.println("TConstructor\t" + Integer.toHexString(hashCode()));
    }

    public void insert(int Data, Element Root)
    {
        if (this.Root == null)this.Root = new Element(Data);
        if (Root == null)return;
        if(Data < Root.Data)
        {
            if(Root.Left == null)Root.Left = new Element(Data);
            else insert(Data, Root.Left);
        }
        else
        {
            if(Root.Right ==null)Root.Right = new Element(Data);
            else insert(Data, Root.Right);
        }
    }

    public int minValue(Element Root)
    {
        if (Root.Left == null)return Root.Data;
        else return minValue(Root.Left);

        //return Root.Left == null ? Root.Data : minValue(Root.Left);

    }

    public int maxValue(Element Root)
    {
        if (Root.Right == null)return Root.Data;
        else return maxValue(Root.Right);
        //return Root.Right == null ? Root.Data : maxValue(Root.Right);

    }

    public int sum(Element Root)
    {
       /* if (Root == null)return 0;                                        // через if
        else return sum(Root.Left) + sum(Root.Right) + Root.Data;*/
        return Root == null ? 0 : sum(Root.Left) + sum(Root.Right) + Root.Data;  // через тернарник
    }
    public void print(Element Root)
    {
        if (Root == null)return;
        print(Root.Left);
        System.out.print(Root.Data + "\t");
        print(Root.Right);
    }
}
