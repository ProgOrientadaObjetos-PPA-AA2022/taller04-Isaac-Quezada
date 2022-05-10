/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instituto;

public class Ejecutor {
    public static void main(String[] args){
        Instituto is = new Instituto();
        is.calcularsueldoTotal();
        
        Instituto is2 = new Instituto("Juan Pablo" , "Sotomayor Quirola" , 420 , "1107012525");
        is2.calcularsueldoTotal();
        
        
        System.out.printf("%s\n" , is);
        System.out.printf("%s\n" , is2);
    }
}
