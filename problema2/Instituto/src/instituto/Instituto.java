/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instituto;

/**
 *
 * @author Matias Quezada
 */
public class Instituto {
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    
    
   public Instituto(){
       nombre = "Isaac Matias" ;
       apellido = "Quezada Alvarez " ;
       sueldoBasico = 425 ;
       cedula = "1106012527" ;        
    }
   
   public Instituto(String n , String a , double sb , String cd){
       nombre = n ;
       apellido = a ;
       sueldoBasico = sb ;  
       cedula = cd ;
    } 
    
    public void establecernombre (String n) {
       nombre = n ;
    }
   
    public void establecerapellido (String a) {
       apellido = a ;
    }   
    
    public void establecersueldoBasico (double sb) {
       sueldoBasico = sb ;
    }   
   
    public void establecercedula (String ce) {
       cedula = ce ;
    } 
    
    public void calcularsueldoTotal() {
       sueldoTotal = sueldoBasico + ((sueldoBasico * 20)/100) ;
    }
    public String obtenernombre(){
        return nombre ;
    }
    public String obtenerapellido(){
        return apellido ;
    }
    public double obtenersueldoBasico(){
        return sueldoBasico ;
    }
    public double obtenersueldoTotal(){
        return sueldoTotal ;
    }
    public String obtenercedula(){
        return cedula ;
    }
    
    @Override
    public String toString() {
        String resultados = String.format("Nombres: %s\n" +
                                        "Apellidos: %s\n" +
                                    "Sueldo Basico: %s\n" +
                                     "Sueldo Total: %s\n" +
                                           "cedula: %s\n" ,
                                          obtenernombre() ,
                                        obtenerapellido() ,
                                    obtenersueldoBasico() ,
                                     obtenersueldoTotal() ,
                                          obtenercedula());
        return resultados;
    }
}
    

