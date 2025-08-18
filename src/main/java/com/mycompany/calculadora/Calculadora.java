package com.mycompany.calculadora;

public class Calculadora {

    private double numero1;
    private double numero2;

    public Calculadora() {
    }

    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double addition() {
        return numero1 + numero2;
    }

    public double subtraction() {
        return numero1 - numero2;
    }

    public double multiplication() {
        return numero1 * numero2;
    }

    public double division() {
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return numero1 / numero2;
    }

    public double potenciacion() {
        return Math.pow(numero1, numero2);
    }

}
