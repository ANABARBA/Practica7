/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarraylist;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author PATITO
 */
public class EjemploArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("A","B","C","D","E","F"));
        lista.forEach(elemento -> {
            System.out.println(" VALOR DE LA LISTA " + elemento);
            if (elemento.equals("D")){
                System.out.println(" \n SE ENCONTRO LA CADENA \n");
            }
        });
        
        lista.add("G");
        lista.add("H");
        System.out.println("\n\n OTRA FORMA DE RECORRER LA LISTA \n");
        for (String contenido : lista){
            System.out.println(" VALOR DE LA LISTA " + contenido );
        }
         
        lista.add("I");
        lista.add("J");
        lista.add("K");
        String variable="L";
        lista.add(variable);
        System.out.println("\n\n OTRA FORMA DE RECORRER LA LISTA \n");
        lista.stream().forEach((contiene ->{
            mensaje(contiene);
        });
        
        
    }
    
    public static void mensaje(String valor){
        System.out.println(" contiene " + valor);
    }
}
