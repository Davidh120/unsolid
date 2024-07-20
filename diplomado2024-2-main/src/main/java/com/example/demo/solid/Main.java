package com.example.demo.solid;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Animal mateo = new Gato();
        mateo.emitirSonido();

        Carro carro = new Hyundai();
        Mazda otroCarro = new Mazda();
        otroCarro.activarTurbo();

        List<Carro> carros = new ArrayList<>();
        carros.add(carro);
        carros.add(otroCarro);
        verPrecioCarro(carros);
        verNoPuertas(carros);
    }

    private static void verNoPuertas(List<Carro> carros) {
        //  Cada clase que hereda de otra puede usarse
        //como su padre sin necesidad de conocer las diferencias entre ellas
        for (Carro carro : carros) {
            if (carro instanceof Mazda) {
                System.out.println(((Mazda) carro).getCantidadPuertas());
            }
            if (carro instanceof Hyundai) {
                System.out.println(((Hyundai) carro).cantidadEntradas());
            }

        }
    }
    //Cuando usamos metodos estaticos??

    public static void verPrecioCarro(List<Carro> carros) {
        for (Carro carro : carros) {
            /*
                if ("BMW".equals(carro.getMarca())) { //Evitar a su buen amigo NullPointerException
                    System.out.println("200");
                } else if (carro.getMarca().equals("Porche")) {
                    System.out.println("300");
                } else if (carro.getMarca().equals("Mazda")) {
                    System.out.println("100");
                }
                //DEAD CODE
            */
            System.out.println(carro.getPrecio());
        }

    }

    //Sobrecarga (Overload)
    // override
}
