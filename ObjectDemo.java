// class Calc{

//     int num1;
//     int num2;
//     int result;

//     public void perform(){
//         result = num1 + num2 ;
//     }
// }

class Calc{

    int num1;
    int num2;
    int result;

    public Calc()
    {
        num1 = 5;
        num2 = 5;
        System.out.println("In constructor");
    }

    public Calc(int n)
    {
        num1 = n;
        num2 = n;

    }

    public Calc(double d,int n){
        num1 = (int)d;
        num2 = n;
    }
    
}



public class ObjectDemo{

    public static void main(String args[])
    {
      Calc obj = new Calc(7.5,4);
    //   obj.num1 = 3;
    //   obj.num2 = 5;
    //   obj.perform();
    // System.out.println(obj.result);
     System.out.println(obj.num1);
     System.out.println(obj.num2);
    }
}