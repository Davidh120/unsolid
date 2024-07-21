package com.example.demo.patrones.comportamiento.strategy;

public class Paypal implements Pago {
    @Override
    public void depositarDinero(String cuentaDestino, int monto) {
        System.out.println("Depositando Dinero a través de SOAP ha la cuenta " + cuentaDestino + " el monto " + monto);
    }
}
