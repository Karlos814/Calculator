package com.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorKodillaApplication {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.plus(5, 5);
        calculator.minus(10, 5);

    }

}
