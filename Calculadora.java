/**
 * Laboratório de Programação 2 - Lab 1 
 * @author Gustavo Franco França - 124110245
 */

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String operacao = input.nextLine();
        
        boolean soma = operacao.equals("+");
        boolean subtracao = operacao.equals("-");
        boolean multiplicacao = operacao.equals("*");
        boolean divisao = operacao.equals("/");

        if (soma || subtracao || multiplicacao || divisao){
            double valor1 = input.nextDouble();
            double valor2 = input.nextDouble();

            if (soma){
                double resultado = valor1 + valor2;
                System.out.println("RESULTADO: " + resultado);

            } else if(subtracao){
                double resultado = valor1 - valor2;
                System.out.println("RESULTADO: " + resultado);

            } else if (multiplicacao){
                double resultado = valor1 * valor2;
                System.out.println("RESULTADO: " + resultado);

            } else {
                if(valor2 == 0){
                    System.out.println("ERRO");
                } else {
                    double resultado = valor1 / valor2;
                    System.out.println("RESULTADO: " + resultado);
                }
            }

        } else {
            System.out.println("ENTRADA INVALIDA");
        }
    }
}