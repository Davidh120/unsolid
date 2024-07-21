package com.example.demo.patrones.comportamiento.chain;

public class Manejador500 implements Manejador {

    @Override
    public boolean validar(Moneda moneda) {
        return "COP 500".equals(moneda.getTexto());
    }

    @Override
    public int obtenerValor() {
        return 500;
    }
}
