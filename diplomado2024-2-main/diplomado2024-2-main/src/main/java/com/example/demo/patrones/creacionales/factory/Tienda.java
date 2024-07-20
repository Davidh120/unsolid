package com.example.demo.patrones.creacionales.factory;

public class Tienda {

    public void crearProductos(AbsFactory style) {
       /*
        if (estilo.equals("ArtDeco")) {
            Sofa sofa = new Sofa();
            sofa.construirVictoriano();

            //Silla deco

        } else if (estilo.equals("Victoriana")) {

        } else if (estilo.equals("Moderna")) {

        }

        */
        style.crearSofa();
        style.crearSilla();
    }
}
