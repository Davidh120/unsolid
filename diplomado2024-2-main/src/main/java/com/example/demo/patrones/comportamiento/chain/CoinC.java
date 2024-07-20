package com.example.demo.patrones.comportamiento.chain;

import java.util.List;

public class CoinC {

    private List<Manejador> manejadors;

    public CoinC(List<Manejador> manejadors) {
        this.manejadors = manejadors;
    }

    public int sumarMonedasIngresadas(List<Moneda> monedas) {
        int suma = 0;
        for (Moneda moneda : monedas) {
            for (Manejador manejador : manejadors) {
                if (manejador.validar(moneda)) {
                    suma += manejador.obtenerValor();
                }
            }
        }
        return suma;
    }

}
