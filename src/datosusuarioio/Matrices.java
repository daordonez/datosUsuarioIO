/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosusuarioio;

/**
 *
 * @author diegordonez
 */
public class Matrices {
    public static void main(String[] args) {
    String  nombre;
    
    nombre = "Pep";
    
    String diminutivo = nombre.concat("ito");
    
        System.out.println(diminutivo);
        
        String nombre2 = "Pepe";
    
        if (nombre.equals(nombre2)) {
            System.out.println("Son iguales!");
        } else {
            System.out.println("Son diferentes!!");
        }
    
    }
}
