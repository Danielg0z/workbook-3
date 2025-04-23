package com.pluralsight;

public class Employee {
    private int employeeId;
    private String employeeName;
    private double hoursWorked;
    private double payRate;

    public Employee(int employeeId, String employeeName, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getHoursWorked() {
        return this.hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return this.payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getGrossPay(){
        return this.payRate * this.hoursWorked;
    }
}

