/**
 * Laboratório de Programação 2 - Lab 1
 * @author Gustavo Franco França - 124110245
 */


import java.util.Scanner;

public class AlunosNotas {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int maiorNota = 0;
        int menorNota = 1000;
        int soma = 0;
        int cont = 0;
        int acima = 0;
        int abaixo = 0;

        while(true){
            String lines = input.nextLine();
            String[] notasAluno = lines.split(" ");

            if (lines.equals("-")){
                break;

            } else {
                cont += 1;
            }
           
            int nota = Integer.parseInt(notasAluno[notasAluno.length - 1]);
            soma += nota;
            
            if (nota > maiorNota){
                maiorNota = nota;
            }

            if (nota < menorNota){
                menorNota = nota;
            }

            if(nota >= 700){
                acima += 1;

            } else {
                abaixo += 1;
            }
        }

        int media = soma / cont;

        System.out.println("maior: " + maiorNota);
        System.out.println("menor: " + menorNota);
        System.out.println("media: " + media);
        System.out.println("acima: " + acima);
        System.out.println("abaixo: " + abaixo);

    }
}
