/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diegordonez
 */
import java.util.Scanner;

public class DiasDeLaSeman {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean salir = false;
        
        do {
            System.out.print("Introduce dia de la semana: ");

            int diaSemana = teclado.nextInt();

            switch (diaSemana) {

                case 1:
                    System.out.println("El " + diaSemana + "er dia de la semana es Lunes!!");
                    break;
                case 2:
                    System.out.println("El " + diaSemana + "do dia de la semana es Martes!!");
                    break;
                case 3:
                    System.out.println("El " + diaSemana + "ro dia de la semana es Miercoles!!");
                    break;
                case 4:
                    System.out.println("El " + diaSemana + "to dia de la semana es Jueves!!");
                    break;
                case 5:
                    System.out.println("El " + diaSemana + "to dia de la semana es Viernes!!");
                    break;
                case 6:
                    System.out.println("El " + diaSemana + "to dia de la semana es Sábado!!");
                    break;
                case 7:
                    System.out.println("El " + diaSemana + "mo dia de la semana es Domingo!!");
                    break;
                default:
                    System.out.println("Dia de la semana incorecto");
                    break;
            }
            System.out.print("¿Continuar?[S/N]: ");
            String opcion = teclado.next();
            
            if ("s".equals(opcion)) {
                salir = true;
            }else{
                if ("n".equals(opcion)) {
                    salir = false;
                }
            }
        } while (salir == true);
        
        int vectorParam[] = {10,45,23,45,12};
        /*
            Lee este vector.
        */
        
        forMejorado(vectorParam);
        
    }

    static void forMejorado(int vector[]){
        
        for(int valor:vector){
            System.out.println(valor);
        }
    }
}
