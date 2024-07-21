package com.example.demo.patrones.comportamiento.chain;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Manejador> manejadors = new ArrayList<>();
        manejadors.add(new Manejador200());
        manejadors.add(new Manejador500());
        manejadors.add(new Manejador1000());
        CoinC coinC = new CoinC(manejadors);

        List<Moneda> monedas = new ArrayList<>();
        monedas.add(new Moneda("COP 200", "Plata"));
        monedas.add(new Moneda("SOLES 200", "Plata"));
        monedas.add(new Moneda("USD 1", "Plata"));
        monedas.add(new Moneda("COP 500", "Plata"));
        monedas.add(new Moneda("COP 1000", "Plata"));
        monedas.add(new Moneda("1000 PESOS COLOMBIANOS", "Plata"));

        int dineroValidoIngresado = coinC.sumarMonedasIngresadas(monedas);
        System.out.println("Dinero valido ingresado " + dineroValidoIngresado);
    }
}
