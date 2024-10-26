
package com.jp.poo.poo.integradores.ejemplos;


public class Habitacion {
    
    public enum TipoHabitacion{
    SENCILLA, DOBLE, SUITE;
    }
    
    private int numeroHabitacion;
    private TipoHabitacion tipoHabitacion;
    private double precio;
    
    public Habitacion(int numero, TipoHabitacion tipo){
        this.numeroHabitacion = numero;
        this.tipoHabitacion = tipo;
        this.precio = calcularPrecio();       
    }
    
    
    private double calcularPrecio(){
        switch (tipoHabitacion) {
            case SENCILLA:
                return 50.0;
            case DOBLE:
                return 80.0;
            case SUITE:
                return 120.0;
            default:
                return 0.0;
        }
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
