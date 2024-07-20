package com.example.demo.pruebas;

public class Calculadora {

    public static final int LIMITE_PERMITIDO_DINERO_TRANSFERIR = 1000;

    /*
    public int suma(Integer a, Integer b) {
        if (a != null && b != null) {
            return a + b;
        }
        return 0;
    }

     */
    //Mutantes viven o mueren (muter(Swift),Stryker)
    public int depositarDinero(int dineroActual, int dineroConsignar) {
        if (dineroConsignar > dineroActual) {
            throw new ArithmeticException("Dinero insuficiente");
        }
        if (dineroConsignar > LIMITE_PERMITIDO_DINERO_TRANSFERIR ) {
            throw new IllegalArgumentException("Supera el limite permitido de transaccion");
        }

        return dineroActual - dineroConsignar;
    }
}
