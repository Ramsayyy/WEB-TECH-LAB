import java.util.*;
public class simif
  {
    static public void main(String[] args)
    {
      Scanner myObj=new Scanner(System.in);
      System.out.print("Enter Your Age:");
      int age=myObj.nextInt();
      if(age>=18)
      {
        System.out.println("You are Eligible to Vote.");
      }
    }
  }