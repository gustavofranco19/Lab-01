/**
 * Laboratório de Programação 2 - Lab 1 
 * @author Gustavo Franco França - 124110245
 */

import java.util.Scanner;

public class AcimaDaMedia {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String lines = input.nextLine();
        String[] lista = lines.split(" ");
        String acimaDaMedia = "";
        input.close();

        int soma = 0;
        for(int i = 0; i < lista.length; i ++){
            soma += Integer.parseInt(lista[i]);
        }

        double media = soma / lista.length;

        for (int j = 0; j < lista.length; j ++){
            if(Integer.parseInt(lista[j]) > media){
                acimaDaMedia += lista[j];

                if (j != lista.length -1){
                    acimaDaMedia += " ";
                }
            }
        }
        System.out.println(acimaDaMedia);
    }
}

