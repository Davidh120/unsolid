package com.example.demo.patrones.comportamiento.chain;

public class Manejador1000 implements Manejador {

    @Override
    public boolean validar(Moneda moneda) {
        return "COP 1000".equals(moneda.getTexto()) || "1000 PESOS COLOMBIANOS".equals(moneda.getTexto());
    }

    @Override
    public int obtenerValor() {
        return 1000;
    }
}
