/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author SALA I
 */
public class Tarjeta {

    private String nombreBanco;
    private double cupoMaximo;

    public Tarjeta(String n, int c) {
        nombreBanco = n;
        cupoMaximo = c;
    }

    public void establecerNombreBanco(String b) {
        nombreBanco = b;
    }

    public void establecerCupoMaximo(double c) {
        cupoMaximo = c;
    }

    public String obtenerNombreBanco() {
        return nombreBanco;
    }

    public double obtenerCupoMaximo() {
        return cupoMaximo;
    }   
}
