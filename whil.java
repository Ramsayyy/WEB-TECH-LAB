import java.util.*;
public class whil
  {
    static public void main(String[] args)
    {
      Scanner myObj=new Scanner(System.in);
      System.out.println("-----Multiplication Table-----");
      System.out.print("Enter A Positive Number:");
      int num=myObj.nextInt();
      int i=1;
      while(i<=10)
        {
          System.out.println(i+" * "+num+" = "+(i*num));
          i+=1;
        }
    }
  }