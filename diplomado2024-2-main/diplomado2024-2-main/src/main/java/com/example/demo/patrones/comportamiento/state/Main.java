package com.example.demo.patrones.comportamiento.state;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(false);
        pedido.avanzarEstado();

    }
}
