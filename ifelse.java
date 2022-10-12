import java.util.*;
public class ifelse
  {
    static public void main(String[] args)
    {
      Scanner myObj=new Scanner(System.in);
      System.out.print("Enter Your Age:");
      int age=myObj.nextInt();
      if(age>=18)
        System.out.println("You Are Eligible to Vote");
      else
      {
        int ageDiff=18-age;
        System.out.println("You Still have to wait for "+ ageDiff +" years to vote..");
      }
    }
  }