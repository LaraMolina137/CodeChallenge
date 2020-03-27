/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechallenge;

/**
 *
 * @author Lara
 */
public class Histograma {
        
    public static void generarHistograma(int myArray[]){
        
        int i,num;
        
        for(num=1;num<=5;num++)
        {
            System.out.print(num);
            
            for(i=0;i<10;i++)
            {       
                if(myArray[i] == num)
                    System.out.print("*");     
            }
            
            System.out.println("");
        }
    }
    
}
