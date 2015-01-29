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
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce número para calcular factorial: ");
        int valor = teclado.nextInt();
        
        int result = factorial(valor);
        System.out.println("El factorial de "+valor+" es: "+result);
        
        System.out.println("Introduce posición de la secuencia de Fibo: ");
        int fibon = teclado.nextInt();
        
        int resSecfib = fibo(fibon);
        System.out.println("El valor de la posición: "+fibon+" es: "+resSecfib);
        
        System.out.println("Introduce base del num que deseas calcular: ");
        int bas = teclado.nextInt();
        
        System.out.println("Introduce exp del num que deseas calcular:");
        int exp = teclado.nextInt();
        
        int rBasExp = producto( bas, exp);
        
        System.out.println("El reusltado es: "+rBasExp);
        
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
    
    public static int producto(int bas, int exp){
        int rslt = 0;
        
        if(exp == 0){
            rslt = 0;
        }else{
            if(exp > 0){
            rslt = bas + producto(bas, exp - 1);
            }
        }
        return rslt;
    }
}
