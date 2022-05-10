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
public class Estudiante {

    private String nombreEstudiante;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promediof;
        
    public Estudiante(){
        nombreEstudiante = "Isaac Quezada";
        calificacion1 = 10;
        calificacion2 = 9;
        calificacion3 = 8;
    }
    
    public Estudiante(String n , double cal1 , double cal2 , double cal3 ){
        nombreEstudiante = n;
        calificacion1 = cal1;
        calificacion2 = cal2;
        calificacion3 = cal3;
    }
    
    public void establecernombreEstudiante(String ne){
        nombreEstudiante = ne ;
    }
    
    public void establecercalificacion1(double c1){
        calificacion1 = c1 ;
    }
    
    public void establecercalificacion2(double c2){
        calificacion2 = c2 ;
    }
    
    public void establecercalificacion3(double c3){
        calificacion3 = c3 ;
    }
    
    public void calcularpromediof(){
        promediof = (calificacion1 + calificacion2 + calificacion3) / 3 ;
    }
    
    public String obtenernombreEstudiantes() {
        return nombreEstudiante ;
    }
    
    public double obtenercalificacion1() {
        return calificacion1 ;
    }
    
    public double obtenercalificacion2() {
        return calificacion2 ;
    }
    
    public double obtenercalificacion3() {
        return calificacion3 ;
    }
    
    public double obtenerpromedio() {
        return promediof ;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("El estudiante\n" + 
                                         "Nombre: %s\n" + 
                               "Calificacion 1: %.2f\n" + 
                               "Calificacion 2: %.2f\n" + 
                                "Calificacion 3: %.2f\n"+ 
                                     "Promedio: %.2f\n" ,
                              obtenernombreEstudiantes(),
                                 obtenercalificacion1() ,
                                 obtenercalificacion2() ,
                                 obtenercalificacion3() ,
                                      obtenerpromedio());
        return cadena;
        
    }
}
    
