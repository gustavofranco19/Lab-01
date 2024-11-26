/**
 * Laboratório de Programação 2 - Lab 1 
 * @author Gustavo Franco França - 124110245
 */


import java.util.Scanner;

public class DobroTriplo {

    public static int dobro(int num){
        return num * 2;
    }

    public static int triplo(int num){
        return num * 3;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();

        System.out.println("dobro: " + dobro(numero) + ", triplo: " + triplo(numero));
        input.close();
    }

}