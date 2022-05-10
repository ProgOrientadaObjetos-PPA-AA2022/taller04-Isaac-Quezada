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
public class Automotor {
    
    private String cedula;
    private String marca;
    private double anoFabri;
    private double valorV;
    private double valorM;
    
    public Automotor(){
        cedula = " 1106012527 ";
        marca = " AUDI " ;
        anoFabri = 1980 ;
        valorV = 25000 ;
    }
    
    public Automotor(String c , String m , double af , double vv){
        cedula = c ;
        marca = m ;
        anoFabri = af ;
        valorV = vv ;
    }
    public void establecercedula(String ce){
        cedula = ce;
    }
    
    public void establecermarca(String ma){
        marca = ma ;
    }
    
    public void estableceranoFabri(double afr){
        anoFabri = afr ;
    }
    
    public void establecervalorV(double vva){
        valorV = vva ;
    }
    
    public void calcularvalorM(){
        valorM = (valorV * 0.002)*(2002 - anoFabri);
    }
    
    public String obtenercedula() {
        return cedula ;
    }
    
    public String obtenermarca() {
        return marca ;
    }
    
    public double obteneranoFabri() {
        return anoFabri ;
    }
    
    public double obtenervalorV() {
        return valorV ;
    }
    public double obtenervalorM() {
        return valorM ;
    }
    
    @Override
    public String toString() {
        String datos = String.format("Cedula: %s\n" +
                                      "Marca: %s\n" +
                         "Año de fabricacion: %s\n" +
                         "Valor del Vehículo: %s\n" +
                      "Valor de la Matricula: %s\n" ,
                                    obtenercedula() ,
                                     obtenermarca() ,
                                  obteneranoFabri() ,
                                    obtenervalorV() ,
                                    obtenervalorM());
        return datos;
    }
}
