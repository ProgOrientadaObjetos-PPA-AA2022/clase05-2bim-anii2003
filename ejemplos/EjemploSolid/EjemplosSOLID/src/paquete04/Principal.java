/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        
        TransporteAereo aereo = new TransporteAereo();
        aereo.establecerTransporteAereo("American Airlines");
        aereo.establecerTarifa();        
        
        ArrayList<Transporte> lista = new ArrayList<>();
        
        TiposTransporte tipos = new TiposTransporte();
        lista.add(bus);
        lista.add(taxi);
        lista.add(aereo);
        
        tipos.establecerTransportes(lista);
        tipos.establecerPromedioTarifas();
        
        System.out.printf("Promedio de Tarifas: %.2f\n", 
                tipos.obtenerPromedioTarifas());
        
    }
}
