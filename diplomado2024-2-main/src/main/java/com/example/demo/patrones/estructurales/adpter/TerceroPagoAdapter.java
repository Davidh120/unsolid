package com.example.demo.patrones.estructurales.adpter;

public class TerceroPagoAdapter implements SistemaPago {

    PagoConTerceros pagoConTerceros;

    public TerceroPagoAdapter(PagoConTerceros pagoConTerceros) {
        this.pagoConTerceros = pagoConTerceros;
    }

    @Override
    public void procesarPago(int monto) {
        pagoConTerceros.procesarPago(monto, "102030");
    }
}
