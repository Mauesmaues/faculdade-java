/*Escreva um programa que alimente um vetor com 5 números inteiros e apresente na tela o vetor em
ordem inversa*/
import java.util.Scanner;
class VetorInverso{
    public static void main(String[] args){
        int vetor[] = new int[5];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite um numero para adicionar ao vetor:\n");
            int numero = input.nextInt();
            vetor[i] = numero;
        }

        for(int i = vetor.length - 1; i >= 0; i--){
            System.out.printf("%d", vetor[i]);
        }
    }
}