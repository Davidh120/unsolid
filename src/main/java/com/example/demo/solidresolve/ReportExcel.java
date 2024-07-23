package com.example.demo.solidresolve;

public class ReportExcel implements IReportGenerator{
    @Override
    public void generateReport(Employee employee) {
        System.out.println("Report generated as excel para el empleado " + employee.getName());
    }
}
