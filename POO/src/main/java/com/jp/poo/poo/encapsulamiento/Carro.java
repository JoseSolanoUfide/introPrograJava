
package com.jp.poo.poo.encapsulamiento;

public class Carro {
    private String marca;
    private String modelo;
    private String color;

    
    public Carro(){
        this.marca ="Desconocida";
        this.modelo="Desconocido";
        
    }

    public String getColor() {
        if (this.color==null) {
            System.out.println("Vehiculo sin color definido, no se puede continuar");
    }
        
        return color;
    }

    public void setColor(String color) {
    if ("rojo".equals(color)) {
            System.out.println("Vehiuculo apto para taxi");
            this.color = color;
    }
        this.color = color;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
    
    

