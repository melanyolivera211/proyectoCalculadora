package com.mycompany.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void testAddition() {
        Calculadora calc = new Calculadora(5, 3);
        double resultado = calc.addition();
        System.out.println("🔹 Probando suma: 5 + 3 = " + resultado);
        assertEquals(8, resultado, "5 + 3 debe ser 8");
        System.out.println("Suma correcta");
    }

    @Test
    void testSubtraction() {
        Calculadora calc = new Calculadora(10, 4);
        double resultado = calc.subtraction();
        System.out.println("🔹 Probando resta: 10 - 4 = " + resultado);
        assertEquals(6, resultado, "10 - 4 debe ser 6");
        System.out.println("Resta correcta");
    }

    @Test
    void testMultiplication() {
        Calculadora calc = new Calculadora(7, 6);
        double resultado = calc.multiplication();
        System.out.println("🔹 Probando multiplicación: 7 * 6 = " + resultado);
        assertEquals(42, resultado, "7 * 6 debe ser 42");
        System.out.println("Multiplicación correcta");
    }

    @Test
    void testDivision() {
        Calculadora calc = new Calculadora(20, 5);
        double resultado = calc.division();
        System.out.println("🔹 Probando división: 20 / 5 = " + resultado);
        assertEquals(4, resultado, "20 / 5 debe ser 4");
        System.out.println("División correcta");
    }

    @Test
    void testDivisionPorCero() {
        Calculadora calc = new Calculadora(10, 0);
        System.out.println("🔹 Probando división por cero...");
        assertThrows(ArithmeticException.class, calc::division,
                "Dividir entre cero debe lanzar ArithmeticException");
        System.out.println(" División por cero no se puede");
    }

    @Test
    void testPotenciacion() {
        Calculadora calc = new Calculadora(2, 3);
        double resultado = calc.potenciacion();
        System.out.println("🔹 Probando potenciación: 2 ^ 3 = " + resultado);
        assertEquals(8, resultado, "2 ^ 3 debe ser 8");
        System.out.println("Potenciación correcta");
    }
}
