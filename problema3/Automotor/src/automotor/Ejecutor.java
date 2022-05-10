/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automotor;

/**
 *
 * @author Matias Quezada
 */
public class Ejecutor {
    public static void main(String[] args) {
        Automotor au = new Automotor();
        au.calcularvalorM();
        
        Automotor au2 = new Automotor(" 1153412321 " , " BMW " , 1500 , 35000);
        au2.calcularvalorM();
        
        System.out.printf("%s\n" , au);
        System.out.printf("%s\n" , au2);        
    }
}
