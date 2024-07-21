package com.example.demo.solid;

//Busca ser papa de otras clases y no lograr ser instanciadas
public interface Carro {

    //Cuando usar clases abstractas y cuando usar interfaces.
    // Vamonos por intefaces, hasta el momento en que queramos añadir comportamiento heredado a nuestros hijos
    int getPrecio();

}
