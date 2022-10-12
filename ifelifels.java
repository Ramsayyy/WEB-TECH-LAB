import java.util.*;
public class ifelifels 
  {
    public static void main(String[] args)throws Exception
    {
    Scanner myObj=new Scanner(System.in);
      System.out.println("Enter Your Marks:");
    int marks=myObj.nextInt();
    if(marks>75){
		System.out.println("First class");
	  }
	else if(marks>65){
		System.out.println("Second class");
	  }
	else if(marks>55){
		System.out.println("Third class");
	  }
	else{
		System.out.println("Fourth class");
	  }
}
  }