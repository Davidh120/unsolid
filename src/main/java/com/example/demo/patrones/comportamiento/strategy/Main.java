package com.example.demo.patrones.comportamiento.strategy;

public class Main {

    public static void main(String[] args) {
        Compra compra = new Compra();
        compra.confirmarCompra(new Paypal(), "Daniel", 50, null);
    }
}
