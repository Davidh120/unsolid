package com.example.demo.patrones.comportamiento.state;

public class Pedido {

    Estado estado;
    boolean turbo;


    public Pedido(boolean turbo) {
        this.estado = new EstadoAprobado();
        this.turbo = turbo;
    }

    /*
    void avanzarEstado() {
        if (estado.equals("Aprobada")) {
            estado = "Preparacion";
            //Disparar logica acá
            //facture, notifque restaurante bla bla bla
        } else if ("Preparacion".equals(estado)) {
            estado = "Reparto";
            //Notifique al cliente, calcule tiempo entrega
            //bla bla bla
        } else if ("Reparto".equals(estado)) {
            estado = "Finalizado";
        }
    }
*/
    public void avanzarEstado() {
        estado.avanzarPedido(this);
    }
}
