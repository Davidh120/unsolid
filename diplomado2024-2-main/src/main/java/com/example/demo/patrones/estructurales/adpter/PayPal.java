package com.example.demo.patrones.estructurales.adpter;

public class PayPal implements PagoConTerceros {

    public void procesarPago(int monto, String convenio) {
        System.out.println("Procesando Pago CON PAYPAL" + monto + " convenio: " + convenio);
    }
}
