package com.example.demo.patrones.comportamiento.state;

public class EstadoPreparacion implements Estado {
    @Override
    public void avanzarPedido(Pedido pedido) {


        System.out.println("Avanzando estado del pedido de Praracion a finalizado");
        //pedido.estado = new EstadoPreparacion();
    }
}
