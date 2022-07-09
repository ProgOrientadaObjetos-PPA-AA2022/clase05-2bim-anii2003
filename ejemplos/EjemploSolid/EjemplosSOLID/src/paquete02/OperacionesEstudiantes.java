/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {
    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private String promedioEdadesCualitativo;

    /*
    promedioEdadesCualitativo;
    promedio jóvenes: mayor igual a 0 y menor igual a 21
    primedio adulto: mayor a 21
    */
    
    public void establecerEstudiante(ArrayList<Persona> lista){
        estudiantes = lista;
    }
    
    public ArrayList<Persona> obtenerEstudiante(){
        return estudiantes;
    }
    
    public void establecerPromedioEdades(){
        double suma = 0;
        for(Persona e: obtenerEstudiante()){
            suma = e.obtenerEdad();
        }
        
        /*for (int i = 0; i < estudiantes.size(); i++) {
            suma = suma + estudiantes.get(i).obtenerEdad();
        }*/
        
        promedioEdades = suma/obtenerEstudiante().size();
    }
    
    public void establecerPromedioEdadesCualitativo(){
        if(promedioEdades >= 0 && promedioEdades <= 21){
            promedioEdadesCualitativo = "Promedio jóvenes";
        }
        else{
            if(promedioEdades > 21){
                promedioEdadesCualitativo = "Promedio adulto";
            }
        }
    }
    
    public double obtenerPromedioEdades(){
        
        return promedioEdades;
    }
    
    public String obtenerPromedioEdadesCualitativo(){
        return promedioEdadesCualitativo;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("-- LISTADO DE ESTUDIANTES --");
        for (Persona e: obtenerEstudiante()) {
            cadena = String.format("%s\n%s",
                    cadena,
                    e.obtenerNombre());
        }
        cadena = String.format("%s\n"
                + "Promedio de edades: %.2f\n"
                + "Promedio cualitativo: %s\n",
                cadena,
                promedioEdades,
                promedioEdadesCualitativo);
        return cadena;
    }    
}
