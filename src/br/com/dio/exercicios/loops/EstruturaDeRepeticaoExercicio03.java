package br.com.dio.exercicios.loops;
import java.util.Scanner;

/* Faça um programa que leia 5 números
    e informe o maior número
    e a média desses números
 */


public class EstruturaDeRepeticaoExercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int numero;
         int maior = 0;
         int soma = 0;
         int i = 0;

         do {
             System.out.println("Número: ");
             numero = sc.nextInt();
             soma = soma + numero;
             if(numero > maior) maior = numero;
             i++;

         } while (i<5);

        System.out.println("MEDIA " + (soma/5)) ;
        System.out.println("MAIOR: " + maior) ;


        }
    }


