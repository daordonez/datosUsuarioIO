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
public class Vectores {
    
    public static void main(String[] args) {
        float precios[] = {12,33,555,44,66,5,44,4,4,4};
        
        //Formas de recorrer un vector
        //1ra Forma
        
        for (int i = 0; i < precios.length; i++) {
            float precio = precios[i];
            System.out.println("En la posición "+i+" el vector vale "+precio);
            
        }
        //2da forma de recorrer vector
        
        for (float precio:precios){
            System.out.println(precio);
        }
    }
}
