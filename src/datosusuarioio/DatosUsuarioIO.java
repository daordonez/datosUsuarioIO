/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosusuarioio;

import java.io.*;
/**
 *
 * @author diegordonez
 */
public class DatosUsuarioIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        String nombre = "";
        
        System.out.println("¿Cuál es tu nombre? ");
        
        try {
            nombre = teclado.readLine();    
        } catch (IOException e) {
            System.out.println("Ha habido un error en la recogida de texto!!");
        }
        System.out.println("¡Hola! "+nombre);
    }
}

 

    
    
    
    