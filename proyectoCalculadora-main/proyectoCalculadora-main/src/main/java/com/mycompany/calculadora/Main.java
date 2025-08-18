package com.mycompany.calculadora;
import java.util.*;
/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Calculadora c = new Calculadora();

        double a, b;
        byte op;
        
        do{
            System.out.println("¿Que operación desea hacer?");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potenciación");
            System.out.println("6. Salir");
            op = leerOpcion(entrada, "opcion");
            
            switch (op){
                case 1 -> { 
                    System.out.println("=====Calculadora=====");
                    a = leerNumero(entrada, "Ingrese número a: ");
                    b = leerNumero(entrada, "Ingrese número b: ");

                    c.setNumero1(a);
                    c.setNumero2(b);
                    System.out.println("Resultado de la suma: "+c.addition());
                }
                case 2 -> { 
                    System.out.println("=====Calculadora=====");
                    a = leerNumero(entrada, "Ingrese número a: ");
                    b = leerNumero(entrada, "Ingrese número b: ");

                    c.setNumero1(a);
                    c.setNumero2(b);
                    System.out.println("Resultado de la resta: "+c.subtraction());
                }
                case 3 -> { 
                    System.out.println("=====Calculadora=====");
                    System.out.println("Ingrese numero a: ");
                    a = entrada.nextDouble();

                    System.out.println("Ingrese numero b: ");
                    b = entrada.nextDouble();

                    c.setNumero1(a);
                    c.setNumero2(b);
                    System.out.println("Resultado de la multiplicación: "+c.multiplication());
                }
                case 4 -> {
                    System.out.println("=====Calculadora=====");
                    a = leerNumero(entrada, "Ingrese número a: ");
                    b = leerNumero(entrada, "Ingrese número b: ");

                    c.setNumero1(a);
                    c.setNumero2(b);
                    System.out.println("Resultado de la potenciación: "+c.division());
                }
                case 5 -> { 
                    System.out.println("=====Calculadora=====");
                    a = leerNumero(entrada, "Ingrese número a: ");
                    b = leerNumero(entrada, "Ingrese número b: ");

                    c.setNumero1(a);
                    c.setNumero2(b);
                    System.out.println("Resultado de la potenciación: "+c.potenciacion());
                }
                case 6 -> System.out.println("Salir de la calculadora...");
            }
        }while(op!=6);
    }
    public static double leerNumero(Scanner entrada, String mensaje){
        while(true){
            System.out.println(mensaje);
            if(entrada.hasNextDouble()){
                return entrada.nextDouble();
            } else {
                System.out.println("Ingrese un número válido");
                entrada.next();
            }
        }  
    }
    public static byte leerOpcion(Scanner entrada, String mensaje){
        while(true){
            System.out.println(mensaje);
            if(entrada.hasNextByte()){
                return entrada.nextByte();
            } else {
                System.out.println("Ingrese un número válido");
                entrada.next();
            }
        }  
    }
}
