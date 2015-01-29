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

public class EjerciciosExamen {
    
    public static void main(String[] args) {
        
//        Scanner teclado = new Scanner(System.in);
//        
//        System.out.print("Introduce número para calcular factorial: ");
//        int valor = teclado.nextInt();
//        
//        int result = factorial(valor);
//        System.out.println("El factorial de "+valor+" es: "+result);
//        
//        System.out.println("Introduce posición de la secuencia de Fibo: ");
//        int fibon = teclado.nextInt();
//        
//        int resSecfib = fibo(fibon);
//        System.out.println("El valor de la posición: "+fibon+" es: "+resSecfib);
//        
//        System.out.println("Introduce prim num que deseas calcular: ");
//        int bas = teclado.nextInt();
//        
//        System.out.println("Introduce seg  num que deseas calcular:");
//        int exp = teclado.nextInt();
//        
//        int rBasExp = producto( bas, exp);
//        
//        System.out.println("El reusltado es: "+rBasExp);
        
        System.out.println(palindromo("abccba"));
        
        
    }
    public static int factorial(int num){
        
        //Multiplica la sucesión natural de numeros hasta el dado
    int res = 0;
    
        if (num == 0) { // Caso base
            res = 1;
        }else{
            if(num > 0){// Evitar bucle infinito
                res = num * factorial(num - 1);
            }
        }
    return res;
    }
    
    public static int fibo(int pos){
        int numFib;
        
        if (pos == 1 || pos == 2) { // Caso base, primeras dos posiciones de la secuencia son uno
            numFib = 1;
        }else{
            numFib = fibo(pos - 2) + fibo(pos - 1);
        }
   
        return numFib;
    }
    
    public static int producto(int num1, int num2){
        int rslt = 0;
        
        if(num2 == 0){ //Caso base, multiplicaciónes por cero = 0
            rslt = 0;
        }else{
            if(num2 > 0){ // evitar bucle infinito al ir descontando en la resucurisivdad
            rslt = num1 + producto(num1, num2 - 1);
            }
        }
        return rslt;
    }
    
    public static boolean palindromo(String frase){
        

        if (frase.length() < 2) { // Caso base
            return true;
        }
        if (frase.charAt(0) == frase.charAt(frase.length() - 1)) {
            return  palindromo(frase.substring(1, frase.length() -1 ));
        } else {    
          return false;
        }
        
    }
}
