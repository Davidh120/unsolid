package com.example.demo.patrones.estructurales.adpter;

public class SistemaPagoPropio implements SistemaPago {


    @Override
    public void procesarPago(int monto) {
        System.out.println("PAGANDO CON EL SISTEMA PROPIO");
    }
}
