/*Escreva um programa que alimente uma matriz de 2 x 3 elementos inteiros e, utilizando estruturas de
repetição, apresente na tela a soma de todos os elementos da matriz*/
import java.util.Scanner;
import java.util.Random;
class MatrisAlimentando{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random numeroRandom = new Random();
        int matriz[][]= new int[3][4];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                matriz[i][j] = numeroRandom.nextInt(15);
            }
        }
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.printf("%d | ", matriz[i][j]);
            }
                System.out.print("\n");
        }
    }
}