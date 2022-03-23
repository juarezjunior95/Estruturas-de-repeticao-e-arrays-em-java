package br.com.dio.exercicios.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
 */

public class OrdemInversa {
    public static void main(String[] args) {

        int[] vet = {2, -5, 12, 50, -8, 4};
        int count = 0;
        int i;



        System.out.println("Vetor: ");

        while (count < (vet.length)) {
            System.out.print(vet[count] + " ");
            count++;
        }
        System.out.println("\nVetor: ");


        for (i = (vet.length - 1); i >= 0; i--){
            System.out.print(vet[i] + " ");
        }

    }
}
