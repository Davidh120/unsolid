package com.example.demo.patrones.estructurales.adpter;

import java.util.List;

public class Compra {

    SistemaPago sistemaPago;

    public Compra(SistemaPago sistemaPago) {
        this.sistemaPago = sistemaPago;
    }

    public void confirmarCompra(String cliente, int monto, List<String> productos) {
        //LOGICA PARA CONFIRMAR LA COMPRA
        sistemaPago.procesarPago(monto);
    }

    public void confirmarCompraMal(String cliente, int monto, List<String> productos, int proveedor) {
        if (proveedor == 1) {
            PayPal payPal = new PayPal();
            payPal.procesarPago(monto, "102030");
        } else if (proveedor == 2) {
            SistemaPagoPropio sistemaPagoPropio = new SistemaPagoPropio();
            sistemaPagoPropio.procesarPago(monto);
        }

    }
}
