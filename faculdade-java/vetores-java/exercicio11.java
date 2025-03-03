/*Escreva um programa alimente um vetor de 5 números inteiros distintos. Em seguida, leia um número
qualquer do teclado e mostre na tela o índice em que ele se encontra no vetor, ou então a mensagem
"Elemento não encontrado!", se ele não estiver presente no vetor.*/
import java.util.Scanner;
class BuscarVetor{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int busca, encontrado = 0;
        int vetor[] = new int[5];
        for(int i = 0; i < vetor.length; i++){
            System.out.printf("Digite um valor para preencher o elemento [i] um vetor de 5 elementos:", i + 1);
            vetor[i] = input.nextInt();
        }
        System.out.print("Digite um valor para descobrir se ele se encontra no vetor");
        busca = input.nextInt();
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == busca){
                System.out.printf("O valor foi encontrado no vetor [%d] = %d", i, vetor[i]);
                encontrado++;
            }else continue;
        }
        if(encontrado == 0){
            System.out.print("O valor nao esta presente em nenhum indice do vetor");
        }
    }
}