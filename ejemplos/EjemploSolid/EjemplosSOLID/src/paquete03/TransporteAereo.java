/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author DELL
 */
public class TransporteAereo {
    private String transporteAereo;
    private double tarifa;
    
    public void establecerTransporteAereo(String n){
        transporteAereo = n;
    }
    
    public void establecerTarifa(){
        tarifa = 800 + (800*0.2);
    }
    
    public String obtenerTransporteAereo(){
        return transporteAereo;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }    
}
