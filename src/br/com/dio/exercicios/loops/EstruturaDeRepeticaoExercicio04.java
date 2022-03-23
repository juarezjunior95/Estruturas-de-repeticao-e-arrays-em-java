package br.com.dio.exercicios.loops;

import java.util.Scanner;
/*
    Faça um programa que peça  N números inteiros,
    calcule e mostre a quantidade de números pares
    e a quantidade de números ímpares.
 */



public class EstruturaDeRepeticaoExercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;
        int i = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = sc.nextInt();

        do {
            System.out.println("Número: ");
            numero = sc.nextInt();
            if(numero % 2 ==0) quantPares++;
            else quantImpares++;
            i++;

        }while(i<quantNumeros);

        System.out.println("Quantidade de pares :" + quantPares);
        System.out.println("Quantidade de impares :" + quantImpares);


    }

}
