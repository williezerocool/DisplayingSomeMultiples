/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displayingsomemultiples;

import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class DisplayingSomeMultiples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ky = new Scanner(System.in);
        int userName;
        
        System.out.print("Choose a number? ");
        userName = ky.nextInt();
        
        for(int i =1; i <= 12; i++){
            
            System.out.println(userName + " * " + i + " = " + (i * userName));
        }
    }
    
}
