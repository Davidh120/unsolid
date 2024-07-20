package com.example.demo.patrones.estructurales.proxy.carpeta;

import com.example.demo.patrones.estructurales.proxy.Internet;

public class Proxy implements Internet {

    private Internet internet;

    public Proxy() {
        this.internet = new Service();
    }

    @Override
    public String navegar(String url) {

        if (url.contains("xxx") || url.contains("youtube")) {
            throw new RuntimeException("Navegación prohibida");
        }
        return internet.navegar(url);
    }
}
