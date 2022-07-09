/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {       
       Persona estudiante1 = new Persona("José",20);
       Persona estudiante2 = new Persona("Sebastian",21);
       Persona estudiante3 = new Persona("Sofía",22);
       
       ArrayList<Persona> personas = new ArrayList<>();
       
       // 2. Agregar a un ArrayList
       personas.add(estudiante1);
       personas.add(estudiante2);
       personas.add(estudiante3);
       
       // 3. Generar el objeto de  tipo Operaciones Estudiante
       OperacionesEstudiantes operacionesE = new OperacionesEstudiantes();
       operacionesE.establecerEstudiante(personas);
       operacionesE.establecerPromedioEdades();
       operacionesE.establecerPromedioEdadesCualitativo();
       
        System.out.printf("%s\n",operacionesE);
       
    }
}
