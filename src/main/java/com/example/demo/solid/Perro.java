package com.example.demo.solid;

public class Perro implements Animal{
    @Override
    public void emitirSonido() {
        System.out.println("WUAO WUAO");
    }

    @Override
    public void alimentarse() {

    }

    @Override
    public void dormir() {

    }

    @Override
    public void divertirse() {

    }

    @Override
    public void volar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
