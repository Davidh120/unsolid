package com.example.demo.id.alto;

public class Factura {

    private Notificacion notificacion;
    private ReteICA reteICA;

    //Puedo hacer inyeccion de depdencias, sin hacer inversion de depdencias
    //No puedo hacer inversion de dependencias, sin hacer inyeccion de dependencias.
    public Factura(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    public void facturar(String cliente, int monto) {
        System.out.println("Facturando..." + monto + " Cliente " + cliente);
        reteICA.obtenerICA();
        notificacion.notificar(cliente);
    }

    /*
        Constructor
        Parametro
     */
}
