/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author DELL
 */
public class TransporteMaritimo extends Transporte {

    private String transporteMaritimo;

    public void establecerTransporteAereo(String n) {
        transporteMaritimo = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 100.00 + 50.00;
    }

    public String obtenerCooperativaBus() {
        return transporteMaritimo;
    }

    public String toString() {
        String cadena = String.format("Transporte Marítimo %s: $%.2f\n",
                transporteMaritimo,
                tarifa);
        return cadena;
    }
}
