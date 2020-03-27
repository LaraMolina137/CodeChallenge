/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechallenge;
import java.util.ArrayList;
//import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;

/**
 *
 * @author Lara
 */
public class CodeChallenge {

    /**
     * @param args the command line arguments
     */
    
    public static void Ejercicio1 ()
    {
        int myArray [] = {1,2,1,3,3,1,2,1,5,1};
        
        System.out.println("Ejercicio 1: Histograma");
        Histograma.generarHistograma(myArray);
        
    }
    
    public static void Ejercicio2 ()
    {   
        char area[][] = {{'X','0','0','0'},{'O','0','0','0'},{'O','0','0','0'},{'O','0','0','0'}};
        int matriz [][] = {{1,2},{-1,1},{0,1},{2,-1},{-1,-2}};
        int i,j;
        
        System.out.println("Ejercicio 2: Movimiento de la X");
        DesplazamientoDeX.desplazaX(matriz, area);
        
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
                System.out.print(area[i][j]);

            System.out.println("");
        }
    }
    
    public static void Ejercicio3 ()
    {
        CodigoDeProducto cod = new CodigoDeProducto("DCR-88578-9");
        ArrayList<String> lista = new ArrayList<String>();
        ArrayList<String> lista1 = new ArrayList<>();
        ArrayList<String> listaUnion,listaInterseccion;
        
        
        System.out.println("Ejercicio 3");
        System.out.println("a.Verifica si es prioritario");
        System.out.println(cod.esPrioritario());
        System.out.println("");
        
        System.out.println("b.Verifica codigo geografico");
        System.out.println(cod.verificar());
        System.out.println("");
        
        System.out.println("c.Ordena la lista");
        lista.add("DCR-88578-9");
        lista.add("KLN-88578-9");
        lista.add("AAA-88578-9");
        lista.add("JKN-88578-9");
        CodigoDeProducto.ordenaLista(lista);
        
        lista.stream().forEach((elemento) -> {
               System.out.println(elemento);
        });
        System.out.println("");
        
        System.out.println("d.Union de dos listas");
        lista1.add("AAA-88578-9");
        lista1.add("KLN-88578-9");
        lista1.add("III-88578-9");
        listaUnion = CodigoDeProducto.unionLista(lista, lista1);
        
        listaUnion.stream().forEach((elemento) -> {
            System.out.println(elemento);
        }); 
        System.out.println("");
        
        System.out.println("e.Interseccion de dos listas");
        listaInterseccion = CodigoDeProducto.interseccionLista(lista, lista1);
        
        listaInterseccion.stream().forEach((elemento) -> {
            System.out.println(elemento);
        }); 
        System.out.println("");
        
    }
            
            
    public static void main(String[] args) {
        
        Ejercicio1();
        System.out.println("--------------------");
        Ejercicio2();
        System.out.println("--------------------");
        Ejercicio3();
        
    }
    
    
}
    
