package com.example.demo.patrones.estructurales.proxy;

import com.example.demo.patrones.estructurales.proxy.carpeta.Proxy;

public class Main {

    public static void main(String[] args) {

        Internet internet = new Proxy();
        String resultado = internet.navegar("xxx");
        System.out.println(resultado);
    }
}
