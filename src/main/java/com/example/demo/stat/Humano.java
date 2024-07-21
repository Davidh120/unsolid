package com.example.demo.stat;

public class Humano {

    //Static: Variables y Metodos
    //Abstract: Metodos y clases
    //final: Variables (que no pueda cambiar una vez se coloque el valor
    // , Metodos (que no se pueda sobreescribir), Clases (que no se pueda heredar)

    String nombre;
    static String variableStatica;
    static final double PI = 3.14;

    //metodo estatico: solo puede acceder a variables estaticas.
    static void cualquierCosa() {
       // System.out.println(nombre);
    }

    //Metodo de instancia: Puede acceder a variables estaticas y no esticas
    void otraCosa() {
        Math.pow(10, 2);

        System.out.println(nombre);
        System.out.println(variableStatica);
    }
}
