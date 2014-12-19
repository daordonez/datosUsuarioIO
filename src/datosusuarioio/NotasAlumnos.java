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

import java.io.*;

public class NotasAlumnos {
    
    static final int MAX_ALUM = 3;
    static final int MAX_NOTA = 3;
    
    public static void main(String[] args) {
        
        //Elimina primera posición del vector
        int alumnos = MAX_ALUM + 1;
        int nota = MAX_NOTA + 1;
        
        //Creación de matriz para alunos y notas
        int notas[][] = new int[alumnos][nota];
        
        //Introduccion de datos en la matriz
        for (int alu = 1; alu < notas.length; alu++) {
            for (int eva = 1; eva < nota; eva++) {
                System.out.print("Introduce nota de alumno "+alu+" en la "+eva+"º evaluación :");
                notas[alu][eva] = leerEntero();
            }
            separadorLineas(15, '-');
        }
        
        muestraLeyenda("Eh pringao!");
        
        //Lectura de la matriz
        for(int alu = 1 ; alu < notas.length; alu++) {
            System.out.println("Alumno "+alu);
            for(int eva = 1; eva < nota; eva++) {
                int tmpNot = notas[alu][eva];
                System.out.println("Evaluación "+eva+" :"+tmpNot);
            }
            System.out.println("");
        }
    }
    
    static int leerEntero(){
        int entero;
        
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        //Inicializar la variable de retorno en algun punto del try-catch para evitar Warning.
        try {
            entero = Integer.parseInt(teclado.readLine());
        } catch (IOException e) {
            System.out.println("Error en recogida de datos numericos");
            entero = 0;
        }
    
        return entero;
    }
    
    static void separadorLineas(int cant,char sep) {
        for (int i = 0; i < cant; i++) {
            System.out.printf("%c",sep);
        }
        System.out.println("");
    }
    
    static void muestraLeyenda(String leyenda) {
        
        separadorLineas(20, '*');
        System.out.printf("%s",leyenda);
        System.out.println("");
        separadorLineas(20, '*');
    }
    
    
}
