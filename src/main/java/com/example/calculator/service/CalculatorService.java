package com.example.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String greetings() {
        return "Добро пожаловать в калькулятор";
    }

    public int plus(int a, int b) {
        return a + b;
    }
    
    public String massage(int a, int b, char process, int result) {
        String firstParam = "" + a;
        String secondParam = "" + b;
        String operation = "" + process;

        return firstParam + operation + secondParam + "=" + (result + "");
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}
