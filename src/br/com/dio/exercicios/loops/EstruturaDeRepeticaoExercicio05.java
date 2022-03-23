package br.com.dio.exercicios.loops;
import java.util.Scanner;

/*
Desenvolva um gerador de tabuadas,
capaz de gerar a tabuada de qualquer número inteiro  entre 1 a 10.
O usuário deve informar de qual número ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

TABUADA de 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
 */

public class EstruturaDeRepeticaoExercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================================================");
        System.out.println("                         TABUADA                               ");
        System.out.println("Digite um número:");
        int tabuada = sc.nextInt();
        System.out.println("Tabuada de " + tabuada);
        for(int i= 1; i<=10 ; i++){
            System.out.println(tabuada +" X "+ i + " = " + (tabuada*i));

        }

        System.out.println("==============================================================");

    }
}


