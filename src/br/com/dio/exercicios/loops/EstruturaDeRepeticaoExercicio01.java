package br.com.dio.exercicios.loops;
import java.util.Scanner;
/*
Faça um programa que leia conjunto de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
 */

public class EstruturaDeRepeticaoExercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = scan.next(); // Entrada  do nome

            if(nome.equals("0"))break; // Se o usuário digitar o valor 0, então ele sai do bloco.

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }

    }

}
