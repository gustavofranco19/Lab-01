/**
 * Laboratório de Programação 2 - Lab 1 
 * @author Gustavo Franco França - 124110245
 */

import java.util.Scanner;

public class FuncaoMonotona {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int valor1 = input.nextInt();
        int valor2 = input.nextInt();
        int valor3 = input.nextInt();
        int valor4 = input.nextInt();

        if (valor1 > valor2 && valor2 > valor3 && valor3 > valor4){
            System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");

        } else if (valor1 < valor2 && valor2 < valor3 && valor3 < valor4){
            System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");

        } else {
            System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
        }

    }
}
