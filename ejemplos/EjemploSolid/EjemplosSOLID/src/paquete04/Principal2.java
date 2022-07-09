/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Principal2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // 1. Agregar por teclado n número de Trasnportes
        // Bus, Taxi, Aereo, Marítimo
        // Crear TiposTransporte
        // Presentar un reporte de los transportes
        // Transporte Bus: $1.00
        // Transporte Marítimo: $1000.1
        // Transporte Bus: $3.22
        // Promedio Tarifas
        String nombre;
        int tipoTransporte;
        String continuar;
        ArrayList<Transporte> lista = new ArrayList<>();

        do {
            System.out.println("Por favor seleccione el tipo de transporte a "
                    + "ingresar: \n"
                    + "1. Transporte Bus\n"
                    + "2. Transporte Taxi\n"
                    + "3. Transporte Aéreo\n"
                    + "4. Transporte Marítimo");
            tipoTransporte = leer.nextInt();
            
            switch(tipoTransporte){
                case 1:
                    TransporteBus bus = new TransporteBus();
                    System.out.print("Ingrese el nombre de la cooperativa de "
                            + "buses: ");
                    leer.nextLine();
                    nombre = leer.nextLine();
                    bus.establecerCooperativaBus(nombre);
                    bus.establecerTarifa();
                    
                    lista.add(bus);
                    break;
                    
                case 2:
                    TransporteTaxi taxi = new TransporteTaxi();
                    System.out.print("Ingrese el nombre de la cooperativa de "
                            + "taxi: ");
                    leer.nextLine();
                    nombre = leer.nextLine();                    
                    taxi.establecerCooperativaTaxi(nombre);
                    taxi.establecerTarifa();
                    
                    lista.add(taxi);
                    break;
                    
                case 3:
                    TransporteAereo aereo = new TransporteAereo();
                    System.out.print("Ingrese el nombre de la Aereolínea: ");
                    leer.nextLine();
                    nombre = leer.nextLine();                    
                    aereo.establecerTransporteAereo(nombre);
                    aereo.establecerTarifa();
                    
                    lista.add(aereo);
                    break;
                    
                case 4:
                    TransporteMaritimo maritimo = new TransporteMaritimo();
                    System.out.print("Ingrese el nombre del transporte marítimo: ");
                    leer.nextLine();
                    nombre = leer.nextLine();    
                    maritimo.establecerTransporteAereo(nombre);
                    maritimo.establecerTarifa();
                    
                    lista.add(maritimo);
                    break;
                
                default:
                    System.out.println("Opción incorrecta");
                    break;                    
            }
            System.out.println("¿Desea ingresar más transportes?\n"
                    + "Pulse S para seguir ingresando o N para salir");
            continuar = leer.nextLine();
        } while (continuar.equals("S"));
        
        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransportes(lista);
        tipos.establecerPromedioTarifas();
        
        System.out.printf("%s",tipos);
    }
}
