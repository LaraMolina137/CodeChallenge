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
public class DesplazamientoDeX {  
    
    public static void desplazaX (int matriz[][], char area[][])
    {
        int i,fila=0,columna=0,movHorizontal,movVertical;
       
                for(i=0;i<5;i++)
                {
                    movHorizontal = matriz[i][0];
                    movVertical = matriz[i][1];


                    if( fila+movVertical < 4 && columna+movHorizontal <4)
                    {
                        area[fila][columna] = 'O';
                        fila += movVertical;
                        columna += movHorizontal;
                        area[fila][columna] = 'X';          
                    }
                }          
    }
    
    
    
}
