/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiante;

/**
 *
 * @author Matias Quezada
 */
public class Ejecutor {
    public static void main(String[] args) {
        Estudiante es = new Estudiante();
        es.calcularpromediof();
        
        Estudiante es2 = new Estudiante("Luis Quirola" , 5 , 4 , 3);
        es2.calcularpromediof();
        
        System.out.printf("%s\n" , es);
        System.out.printf("%s\n" , es2);
    }
}
