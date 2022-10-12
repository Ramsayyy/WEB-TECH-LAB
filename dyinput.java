/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wtlab;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class dyinput {
    public static void main(String[] args)
    {
        Scanner myInput=new Scanner(System.in);
        String pName;
        int Jno;
        float goalContributions;
        double xG;
        System.out.println("Enter Player Number:");
        Jno=myInput.nextInt();
        myInput.nextLine();
        System.out.println("Enter Player Name:");
        pName=myInput.nextLine();
        System.out.println("Enter Player GoaL Contributions:");
        goalContributions=myInput.nextFloat();
        System.out.println("Enter Player xG:");
        xG=myInput.nextDouble();
        System.out.println("Player Details are as Follows:");
        System.out.println("Player Number:"+Jno);
        System.out.println("Player Name:"+pName);
        System.out.println("Player Contibutions:"+goalContributions);
        System.out.println("Player xG:"+xG);
        
    }
}
