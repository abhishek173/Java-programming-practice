class Casio{
    int num1;
    int num2;
    String operation;

  public Casio()
  {
      num1 = 0;
      num2 = 0;
      operation = "Nothing";
  }

  public Casio(int i)      // constructor overloading
  {
      num1 = i;
      num2 = 0;
      operation = "Nothing";

  }
  public Casio(int i, int j)
  {
      num1 = i;
      num2 = j;
      operation = "Nothing";
  }
  public Casio(int i, int j, String op)
  {
      num1 = i;
      num2 = j;
      operation = op;
  }
}

public class ObjectDemo4{

    public static void main(String args[])
    {
      Casio obj = new Casio();
      Casio obj1 = new Casio(4);
      Casio obj2  = new Casio(4,5);
      
      Casio obj3  = new Casio(4,5,"ADD");
      
    }
}
