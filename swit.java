import java.util.*;
public class swit
  {
    static public void main(String[] args)
    {
      int a = 5;
      int b = 10;
      switch (a) {  //Outer switch

       case 25/5:
             switch (b) {  // Inner switch. 
               case 100/10:
                     System.out.println("I am inside two switches!!\n");
                     break;
               default:  
                   System.out.println("Me Too\n");
                    break;
             }
          break;
        default:
          System.out.println("I am default\n");
          break;
    }
    
  }
  }