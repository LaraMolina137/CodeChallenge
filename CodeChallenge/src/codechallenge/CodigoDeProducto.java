/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Lara
 */
public class CodigoDeProducto {
    
    private String codigo;

    public CodigoDeProducto(String codigo) {
        this.codigo = codigo;
    }
    
    
    public boolean esPrioritario ()
    {
        return "P".equals(codigo.substring(0,1)) || "W".equals(codigo.substring(0,1));
    }
    
    public boolean verificar ()
    {
        
        String codGeo = codigo.substring(4,9);
        String codVer = codigo.substring(10);
        
        int calculoCodGeo = Integer.decode(codGeo.substring(0,1)) + Integer.decode(codGeo.substring(1,2)) +
                        Integer.decode(codGeo.substring(2,3)) + Integer.decode(codGeo.substring(3,4)) +
                        Integer.decode(codGeo.substring(4,5));
        
        
        if(calculoCodGeo > 9)
            calculoCodGeo = calculoCodGeo / 10 + calculoCodGeo % 10;

        return calculoCodGeo == Integer.decode(codVer);
    }
    
    public static void ordenaLista (ArrayList<String> lista)
    {
        Collections.sort(lista);
    }
    
    public  static ArrayList<String> unionLista (ArrayList<String> lista1, ArrayList<String> lista2)
    {
       
        Set<String> union = new HashSet<String>();
        
        union.addAll(lista1);
        union.addAll(lista2);
        
        
        return new ArrayList<String>(union);
    }
    
    public static ArrayList<String> interseccionLista (ArrayList<String> lista1, ArrayList<String> lista2)
    {
        ArrayList<String> newList = new ArrayList<>();
        
        for (String elemento1 : lista1) 
        {
            if(lista2.contains(elemento1))
                    newList.add(elemento1);
                
        }  
        return newList;
    }
    
}
