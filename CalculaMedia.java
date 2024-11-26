/**
 * Laboratório de Programação 2 - Lab 1 
 * @author Gustavo Franco França - 124110245
 */

import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        double soma = num1 + num2;
        double media = soma / 2;

        if(media >= 7){
            System.out.println("pass: True!");

        } else {
            System.out.println("pass: False!");
        }
    }
}