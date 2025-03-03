/*Escreva um programa que leia uma matriz de 5 x 5 elementos e, utilizando estruturas de repetição,
apresente na tela a soma de todos os elementos da terceira linha da matriz*/
import java.util.Scanner;
import java.util.Random;
class SomarTerceiraLinha{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int matriz[][]= new int[5][5];
        int soma = 0;
        for(int i =0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                matriz[i][j] = rand.nextInt(20);
                System.out.printf("%d ", matriz[i][j]);
                if(i == matriz.length / 2){
                    soma += matriz[i][j];
                    System.out.print("- ");
                }
            }
            System.out.print("\n");
        }
        System.out.printf("A soma da linha 5 da matriz eh; %d", soma);
    }
}