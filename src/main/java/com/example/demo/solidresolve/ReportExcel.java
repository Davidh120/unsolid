package com.example.demo.solidresolve;

public class ReportExcel implements IReportGenerator{
    @Override
    public void generateReport(EmployeeManager employeeManager) {
        System.out.println("Report generated as excel");
    }
}
