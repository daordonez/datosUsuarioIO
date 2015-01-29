/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosusuarioio;


public class Palindromos {
    public static void main(String[] args) {
        
    }
    
    public boolean palindromo (String frase) {
        boolean palSN;
        
        if (frase.length() == 0 || frase.length() == 1) {
            palSN = true;
        }
        //} else {
            if (frase.charAt(0) == frase.charAt(frase.length() - 1) && 
                    palindromo(frase.substring(1,frase.length() -1))) {
                palSN = true;
            } else{
                palSN = false;
            }
        

        return  palSN;

    }
}
