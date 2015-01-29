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
}
