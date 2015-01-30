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

public class Examen {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce cantidad de numeros a ingresar: ");
        int cant = teclado.nextInt();
        
        //Crea vector  
        int vecCont[] = new  int[cant];
        
        for (int i = 0; i < vecCont.length; i++) {
            
            System.out.println("Introduce numero para pos "+i+" :");
            vecCont[i] = teclado.nextInt();
            System.out.println("");
        }
        
        System.out.print("Introduce caracter para mostrar grafico:");
        String caract = teclado.next();
        //Llama constructor de matriz;
        boolean[][] graf = llenaGrafic(vecCont);
        
        //Muestra grafica
        impGraf(vecCont, caract, graf);
        
    }
    
    public static int maximoEnVec(int vect[]){
        int max = 0;
        
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > max) {
                max = vect[i];
            }
        }
        return max;
    }
    
    public static void llenaLinia(boolean matriz[][],int col, int cant){
        
        
        try {
            for (int fil = 0; fil < cant; fil++) {
                matriz[col][fil] = true;
            }
        } catch (Exception e) {
            for (boolean[] matriz1 : matriz) {
                matriz1[col] = true;
            }
        }
    }
    
    public static boolean[][] llenaGrafic(int vec[]){
        //Tamaño justo y necesario
        
       int maxT = maximoEnVec(vec);
       
       //Cración de matriz
       boolean matrizLL[][] = new boolean[maxT][vec.length];
       
        for (int i = 0; i < matrizLL.length; i++) {
            llenaLinia(matrizLL, i, vec[i]);
        }
       
       return matrizLL;
    }
    
    public static void impGraf(int vec[], String car, boolean matriz[][]){
        
        for (int col = 0; col < matriz[0].length; col++) {
            for (int fil = 0; fil < matriz.length; fil++) {
                if (matriz[fil][col] == true) {
                    System.out.printf("%s",car);
                }
            }
            System.out.println(col);
        }
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i]);
        }
        System.out.println("");
    }
}
