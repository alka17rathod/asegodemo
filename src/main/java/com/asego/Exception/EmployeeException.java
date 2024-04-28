package com.asego.Exception;

public class EmployeeException extends Exception{
    public EmployeeException() {
        super("Employee Exception");
    }
    public EmployeeException(String msg) {
        super(msg);
    }
}
