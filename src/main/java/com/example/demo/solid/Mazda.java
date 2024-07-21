package com.example.demo.solid;

public class Mazda implements Carro, Turbo {

    @Override
    public int getPrecio() {
        return 100;
    }

    public int getCantidadPuertas() {
        return 2;
    }

    @Override
    public void activarTurbo() {

    }
}
