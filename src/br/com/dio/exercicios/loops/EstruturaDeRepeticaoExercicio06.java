package br.com.dio.exercicios.loops;
import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número fornecido pelo úsuario.
EX: 5!=120
 */



public class EstruturaDeRepeticaoExercicio06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Fatorial: ");
        int fatorial = sc.nextInt();

        int multiplicacao = 1;
        System.out.print(fatorial + " ! = ");

        for(int i = fatorial; i>=1; i--){
            multiplicacao = multiplicacao * i;
        }
        System.out.println(multiplicacao);
    }
}
