package com.example.demo.patrones.comportamiento.chain;

public class Manejador200 implements Manejador {

    @Override
    public boolean validar(Moneda moneda) {
        return "COP 200".equals(moneda.getTexto()) && "Otro Material".equals(moneda.getTexto());
    }

    @Override
    public int obtenerValor() {
        return 200;
    }
}
