package com.example.demo.pruebas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    /*
    @Test
    void suma() {
        //AAA
        //Preparación de la información necesaria: Arrange
        //Ejecutar el método que queremos: Act
        //VALIDAR EL RESULTADO: Assert
        //Assert:  Assertions o un Verify
        int resultado = calculadora.suma(2, 3);
        assertEquals(5, resultado);
        //Cuantas pruebas unitarias mínimo necesito de un método?
        //Va relacionado con la complejidad ciclomatica del método.

        //Las pruebas deberían trasmitir que esta validando (Given When Then)

        //Las pruebas cumplen el principio FIRST
        //
    }

     */

    @Test
    void DadoDineroConsignarMayorAlActual_CuandoConsigna_EntoncesException() {
        Assertions.assertThrows(ArithmeticException.class, () ->
                calculadora.depositarDinero(100, 200));
    }

    @Test
    void CuandoConsignaMayorAlDineroActual_EntoncesException() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                calculadora.depositarDinero(2000, Calculadora.LIMITE_PERMITIDO_DINERO_TRANSFERIR + 1));
    }

    @Test
    void CuandoConsigneDineroValido_EntoncesResteDineroDisponible() {
        int saldoDespuesTransaccion = calculadora.depositarDinero(2000, 1000);
        assertEquals(1000, saldoDespuesTransaccion);
        //Mutation test: (ESTO COSTOSO PARA LA CPU)
        //Mutation Test es solo la respuesta a malas pruebas, COVERAGE
    }
}