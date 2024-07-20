package com.example.demo.id.bajo;

import com.example.demo.id.alto.Notificacion;

public class NotificacionSabana implements Notificacion {
    @Override
    public void notificar(String cliente) {
        System.out.println("Enviandfo notificación a través de La Sabana");
    }
}
