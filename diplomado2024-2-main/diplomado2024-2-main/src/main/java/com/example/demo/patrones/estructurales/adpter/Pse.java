package com.example.demo.patrones.estructurales.adpter;

public class Pse implements PagoConTerceros {

    public void procesarPago(int monto, String convenio) {
        System.out.println("Procesando Pago CON PSE" + monto + " convenio: " + convenio);
    }
}
