package com.example.demo.solidresolve;

public class ReportPdf implements IReportGenerator{

    @Override
    public void generateReport(Employee employee) {
        System.out.println("Report generated as pdf para el empleado " + employee.getName());
    }
}
