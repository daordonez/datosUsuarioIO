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
        
    }
    public static int factorial(int num){
        
        //Multiplica la sucesión natural de numeros hasta el dado
    int res = 0;
    
        if (num == 0) { // Caso base
            res = 1;
        }else{
            if(num > 0){
                res = num * factorial(num - 1);
            }
        }
    return res;
    }
    
    public static int fibo(int pos){
        int numFib;
        
        if (pos == 1 || pos == 2) {
            numFib = 1;
        }else{
            numFib = fibo(pos - 2) + fibo(pos - 1);
        }
   
        return numFib;
    }
}
