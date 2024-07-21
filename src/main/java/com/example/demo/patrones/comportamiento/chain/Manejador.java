package com.example.demo.patrones.comportamiento.chain;

public interface Manejador {

    boolean validar(Moneda moneda);

    int obtenerValor();
}
