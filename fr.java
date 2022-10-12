import java.util.*;
public class fr
  {
    static public void main(String[] args)
    {
      Scanner myObj=new Scanner(System.in);
      System.out.println("-----Multiplication Table-----");
      System.out.print("Enter A Positive Number:");
      int num=myObj.nextInt();
      int i;
      for(i=1;i<=10;i++)
        {
          System.out.println(i+" * "+num+" = "+(i*num));
          
        }
    }
  }