package com.example.demo.patrones.comportamiento.state;

public class EstadoAprobado implements Estado {

    @Override
    public void avanzarPedido(Pedido pedido) {
        //Disparar logica acá
        //facture, notifque restaurante bla bla bla
        if (pedido.turbo) {

            System.out.println("Un pedido TURBO no tiene tiempo de espera, pasando a finalizado");
            //pedido.estado = new EstadoPreparacion();
        } else {
            System.out.println("Avanzando estado del pedido de Aprobado a Preparacion");
            pedido.estado = new EstadoPreparacion();
        }
    }
}
