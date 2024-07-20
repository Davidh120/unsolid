package com.example.demo.stat;

public class Main {

    public static void main(String[] args) {
        Humano david = new Humano();
        david.nombre = "David";

        Humano juan = new Humano();
        juan.nombre = "Juan";

        System.out.println(david.nombre);
        System.out.println(david);
        System.out.println(juan);
    }
}
