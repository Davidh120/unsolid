package com.example.demo.patrones.comportamiento.strategy;

import java.util.List;

public class Compra {

    public void confirmarCompra(Pago pago, String cliente, int monto, List<String> productos) {
        pago.depositarDinero(cliente, monto);
    }
}
