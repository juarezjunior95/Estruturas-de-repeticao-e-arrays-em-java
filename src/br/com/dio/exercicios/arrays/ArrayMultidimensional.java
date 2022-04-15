package br.com.dio.exercicios.arrays;
import java.util.Random;
/*
    Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0 e 9.
 */

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random valores = new Random();
// apenas um comentario 
        int[][] M = new int[4][4];

        for (int i = 0; i< M.length ; i++){// percorre todos os elementos que estão na linha
            for (int j = 0 ; j < M[i].length ; j++){//  representa cada coluna dentro da linha "i"
                M[i][j] = valores.nextInt(9);
            }
        }
        System.out.println("Matriz: ");
        for (int[] linha : M) {
            for (int elementoDaColuna : linha) {
                System.out.print(elementoDaColuna + " ");

            }
            System.out.println();

        }

    }
}
