/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete03;

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
        
        TransporteAereo avion = new TransporteAereo();
        avion.establecerTransporteAereo("American Airline");
        avion.establecerTarifa();
        
        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransporteBus(bus);
        tipos.establecerTransporteTaxi(taxi);
        tipos.establecerTransporteAereo(avion);
        tipos.establecerPromedioTarifas();        
        
        System.out.printf("Promedio de Tarifas: %.2f\n", 
                tipos.obtenerPromedioTarifas());
        
    }
}
