/**
 * Laboratório de Programação 2 - Lab 1 
 * @author Gustavo Franco França - 124110245
 */

import java.util.Scanner;

public class Wally {

    public static String exibirNome(String[] nomes){
        String novoNome = "?";
        for(String nome : nomes){
            if(nome.length() == 5){
                novoNome = nome;
            }
        }
        return novoNome;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(true){
            String lines = input.nextLine();
            String[] nomes = lines.split(" ");

            boolean verifica = false;
            
            for(String nome : nomes){
                if(nome.equals("wally")){
                    verifica = true;
                }
            }

            if(verifica){
                break;
            }

            System.out.println(exibirNome(nomes));
        }
    }
}
