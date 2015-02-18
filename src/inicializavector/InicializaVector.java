/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicializavector;

/**
 *
 * @author Borja Andrades
 */
public class InicializaVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Vector con 10 numeros
        int[] listaNumeros= {2,54,37,68,97,12,21,88,345,10};
            for(int i=0; i<listaNumeros.length; i++) {
                 System.out.print(1+i);
                 System.out.print(" -> ");
                 System.out.println(listaNumeros[i]);
         }
    }
    
}
