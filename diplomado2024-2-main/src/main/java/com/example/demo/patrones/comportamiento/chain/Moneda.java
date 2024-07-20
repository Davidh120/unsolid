package com.example.demo.patrones.comportamiento.chain;

public class Moneda {

    private String texto;
    private String material;

    public Moneda(String texto, String material) {
        this.texto = texto;
        this.material = material;
    }

    public String getTexto() {
        return texto;
    }
}
