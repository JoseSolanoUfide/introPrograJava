package com.jp.poo.poo;


public class Persona {

    String nombre;
    String apellido;
    String identificacion;
    String email;
    String telefono;
  
    
public void mostrarPersona(){
        
        System.out.println("Nombre " + nombre);
        System.out.println("Apellido " + apellido);
        System.out.println("Identificacion " + identificacion);
        System.out.println("Email " + email);
        
        
    }

    public void contactoPersona(){
        //logica para retornar telefono
        System.out.println("Telefono " +  telefono );
}

    public static void main(String[] args) {
        System.out.println("******* Creacion de Clase y Objetos de Persona *******");
        Persona objeto1 = new Persona();
        //Atributos de la clase Persona
        objeto1.nombre = "Jose";
        objeto1.apellido = "Solano";
        objeto1.telefono = "88888888";
        //Metodosde la clase Persona
        objeto1.mostrarPersona();
        System.out.println("Aca accede al otro metodo");
        objeto1.contactoPersona();
        
        //Atributos de la clase Persona
        Persona objeto2 = new Persona();
        objeto2.nombre = "Axel";
        objeto2.apellido = "Campos";
        //Metodosde la clase Persona
        objeto2.mostrarPersona();
        
        
    }
    
}