package com.example.demo.solidresolve;

public class EmployeeManager implements IEmployeeOperations {

    public void addEmployee(String name) {
        System.out.println("Empleado " + name + "agregado")
    }

    public void removeEmployee(String name) {
        System.out.println("Empleado " + name + "eliminado")
    }
}
