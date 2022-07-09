/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author DELL
 */
public class TransporteAereo extends Transporte {
    private String transporteAereo;

    public void establecerTransporteAereo(String n) {
        transporteAereo = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 100.00 + 50.00;
    }

    public String obtenerCooperativaBus() {
        return transporteAereo;
    }      
    
    public String toString(){
        String cadena = String.format("Transporte Aéreo %s: $%.2f\n",
                transporteAereo,
                tarifa);
        return cadena;
    }
}
