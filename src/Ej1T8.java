/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diegordonez
 */
public class Ej1T8 {
    
    public static void main(String[] args) {
        //Ej1. Declaración e inicialización del vector con valores
        int nuevoVector[] = {20,30,40,50,60,70};
        
        //Ej2. Creación de matriz
        int nuevaMatriz[][] = {{10,20,30},{5,10,15,20}};
        
        //Llamada a función y paso de vector como argumento
        System.out.println("Imprime Vector");
        lectorVectoresInt(nuevoVector);
        
        System.out.println("Imprime Matriz:");
        lectorMatricesInt(nuevaMatriz);
        
        
        
    }
     static void lectorVectoresInt(int vector[]){
         
         //for "mejorado" para lectura de vector en función
         
         for(int eIndividual:vector){
             System.out.print(eIndividual+", ");
         }
         System.out.println("");
     }
     
     static void lectorMatricesInt(int matriz[][]){
            for(int col = 0; col < matriz[0].length; col++){
                for( int fil = 0; fil < matriz.length ; fil++ ){
                    System.out.println("Col "+col+" Fil "+fil);
                }
            }       
     }
}
