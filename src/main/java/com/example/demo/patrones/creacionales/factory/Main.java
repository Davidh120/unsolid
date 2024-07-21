package com.example.demo.patrones.creacionales.factory;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        tienda.crearProductos(new DecoracionModerna());
    }
}
