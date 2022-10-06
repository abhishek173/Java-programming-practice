class Casio{

    public void add(int i, int j)     
    {
        System.out.println(i+j);

    }

    public void add(int i, int j, int k)   // method overloading 
    {
        System.out.println(i+j+k);

    }

    public void add(double i , double j)    // method overloading 
    {
        System.out.println(i+j);
    }
}

public class ObjectDemo3{

    public static void main(String args[])
    {
      Casio obj = new Casio();
      obj.add(5.5,2.1);
    }
}