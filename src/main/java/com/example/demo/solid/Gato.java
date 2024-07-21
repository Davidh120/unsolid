package com.example.demo.solid;

public class Gato implements Animal{
    @Override
    public void emitirSonido() {
        System.out.println("Miau");
        System.out.println(2);
        System.out.println(2.2);
        System.out.println(true);
        System.out.println('a');
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

    }
}
