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
        int nuevoVector[] = {20, 30, 40, 50, 60, 70};

        //Ej2. Creación de matriz
        int nuevaMatriz[][] = {{10, 20, 30}, {5, 10, 15, 20}};
        
        muestraleyenda(1);
        //Llamada a función y paso de vector como argumento
        System.out.println("Imprime Vector");
        lectorVectoresInt(nuevoVector);
        
        muestraleyenda(2);
        //Llamada a lector de matriz
        System.out.println("Imprime Matriz:");
        lectorMatricesInt(nuevaMatriz);
        
        muestraleyenda(3);
        //Ej3. Copia de vectores
        int vecACop [] = {1,2,3,4,5};
        int vecVacio [] = new int[4];
        
        //Comprueba contenido de los vectores
        System.out.println("Contenido vector a copiar");
        for(int elmento:vecACop) {
            System.out.println(elmento);
        }
        
        System.out.println("Vector limpio: ");
        for(int elemento:vecVacio) {
            System.out.println(elemento);
        }
        
        System.out.println("Ejecuta copia");
        
        copiaVec(vecACop, vecVacio);
        
        
        //Ej4. Comparación de vectores
        //Vectores inicializacos para prueba
        int primerVec[] = {30,40,50,20};
        int segunVec[] = {35,45,50,55};
        int tercerVec[]= {30,40,50,20};
        
        
        
        muestraleyenda(4);
        //Comparador de vectores. Longitud,orden,valores en cada posición
        System.out.println("Compara vectores");
        
        boolean resultadoComp = comparadorVectores(primerVec, segunVec);
        
        if ( resultadoComp == false) {
            System.out.println("Los vectores 1 y 2 son diferentes");
        }else{
            System.out.println("Los vectores 1 y 2 son iguales");
        }
        
        boolean resultComp2 = comparadorVectores(primerVec, tercerVec);
        
        if ( resultadoComp == false) {
            System.out.println("Los vectores 1 y 3 son diferentes");
        }else{
            System.out.println("Los vectores 1 y 3 son iguales");
        }

    }

    static void muestraleyenda(int numEj){
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            System.out.print("_");
        }
        System.out.println("");
        System.out.println("Ejercicio "+numEj+".");
        for (int i = 0; i < 10; i++) {
            System.out.print("_");
        }
        System.out.println("");
    }
    static void lectorVectoresInt(int vector[]) {

         //for "mejorado" para lectura de vector en función
        for (int eIndividual : vector) {
            System.out.print(eIndividual + ", ");
        }
        System.out.println("");
    }
    static void lectorMatricesInt(int matriz[][]) {
        for (int fil = 0; fil < matriz.length; fil++) {
            
           lectorMatricesInt(matriz);
        }
    }
    static void copiaVec(int vOrigen[], int vDestino[]){
        //Comprueba que tienen la misma longitud primero para poder copiar
        
        if (vOrigen.length == vDestino.length) {
            for (int i = 0; i < vDestino.length; i++) {
                vDestino[i] = vOrigen[i];    
            }
            //Muestra contenido
            for(int elemento: vDestino) {
            System.out.println(elemento);
        }
        }else {
            System.out.println("Imposible realizar copia de valores, vectores con diferente longitud");
        }
    }
    static boolean comparadorVectores(int vector1[], int vector2[]) {

        /*
         1.Compara longitud, si es igual --> 2. Compara posición a posición
         2.Si alguno de las dos comprobaciones no es correcta devuelve falso
         
         */
        boolean igual;

        igual = true;

        if (vector1.length == vector2.length) {
             //Misma longitud
            //Analisis elemento a elemento

            for (int v1 = 0; v1 < vector1.length; v1++) {
                int tmpVector1 = vector1[v1];
                for (int v2 = 0; v2 < vector2.length; v2++) {
                    int tmpVector2 = vector2[v2];
                    if (tmpVector1 != tmpVector2) {
                        //Si alguno no es igual devuelve false
                        igual = false;
                    }
                }
            }
        } else {
            //No son vectores iguales
            igual = false;
        }

        return igual;
    }
}
