package br.com.dio.exercicios.arrays;
import java.util.Random;

/*
    Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
    Ao final mostre os números e seus sucessores.
 */

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random(); // Classe Random tem o objetivo de gerar números aleatórios

        int[] numerosAleatorios =  new int[20]; //  Guarda um array inteiro

        for(int i = 0; i <numerosAleatorios.length; i++){
            int numero = random.nextInt(100); // bound limita um valor

            numerosAleatorios[i] = numero;
        }

        System.out.print("Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }
        System.out.print("\nAntecessor dos números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }

        System.out.print("\nSucessores dos números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }

    }
}
