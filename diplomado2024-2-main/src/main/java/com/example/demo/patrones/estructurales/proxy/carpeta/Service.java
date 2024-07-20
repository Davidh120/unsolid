package com.example.demo.patrones.estructurales.proxy.carpeta;

import com.example.demo.patrones.estructurales.proxy.Internet;

public class Service implements Internet {

    Service() {

    }

    @Override
    public String navegar(String url) {

        return "Obteniendo informacion de la url " + url;
    }
}
