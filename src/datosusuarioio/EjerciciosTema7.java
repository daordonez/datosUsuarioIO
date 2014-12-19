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

import java.util.Scanner;


public class EjerciciosTema7 {
    /*Para definir Constantes fuera de la función principal es necesario incluir la palabra
    main*/
    
    static final  int N = 4;
    
    public static void main(String[] args) {
        //OJO
        int vector[] = new int[N] ;
        
        //Nuevo objeto que recoja valores de teclado, nombre teclado
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < vector.length; i++) {
            int valorVector;
            valorVector = vector[i];
            System.out.print("Dame número: ");
            //Recoger los valores que introduce el usuario e irlos depositando dentro del vector
            vector[i] = teclado.nextInt();
        }
        //Muestra resultados
        
        for( int elementos:vector){
            System.out.print(elementos+",");
        }
        
    }
    
}
