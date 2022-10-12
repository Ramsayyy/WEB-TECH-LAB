/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
package wtlab;
public class clinput {
    public static void main(String[] args)
    {
        System.out.println("\tCommand Line Input");
        if(args.length!=0)
        {
            for(int i=0;i<args.length;i++)
            {
                System.out.println("Argument "+ i + ":" + args[i]);
            }
                
        }
        else
        {
            System.out.println("Please enter any argument...");
            System.out.println("Exiting Class..");
        }
    }
}
