/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financiera;

/**
 *
 * @author Matias Quezada
 */
public class Financiera {
    
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;
    
    public Financiera(){
        nombreCliente = "Luis Quirola" ;
        nombreBanco = "Pichincha" ;
        valorCheque = 5000 ;
    }
    
    public Financiera(String nc , String nb , double vc) {
        nombreCliente = nc ;
        nombreBanco = nb ;
        valorCheque = vc;
    }
    
    public void establecernombreCliente(String nce){
        nombreCliente = nce ;
    }
    
    public void establecernombreBanco(String nba){
        nombreBanco = nba ;
    }
    
    public void establecervalorCheque(double vch){
        valorCheque = vch ;
    }
    
    public void calcularcomisionBanco(){
        comisionBanco = valorCheque * 0.003 ;
    }
    
    public String obtenernombreCliente(){
        return nombreCliente;
    }
    
    public String obtenernombreBanco(){
        return nombreBanco;
    }
    
    public double obtenervalorCheque(){
        return valorCheque;
    }
    
    public double obtenercomisionBanco(){
        return comisionBanco;
    }
    
    @Override
    public String toString() {
        String Facturita = String.format("Nombre Cliente: %s\n" +
                                         "Nombre Banco:   %s\n" +
                                       "Valor del Cheque: %s\n" +
                                         "Comision Banco: %s\n" , 
                                         obtenernombreCliente() ,
                                           obtenernombreBanco() ,
                                           obtenervalorCheque() ,
                                         obtenercomisionBanco());
    return Facturita;
    }    
}
