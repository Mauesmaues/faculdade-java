/*Escreva um programa que alimente um vetor com 5 números e calcule a média destes valores. Na
sequência, apresente na tela os valores que são iguais ou superiores à média.*/
import java.util.Scanner;
class MediaVetor{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int vetor[]= new int[5];
        int acumulador = 0, media;
        for(int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite um valor para alimentar o indice [%d] de um vetor de 5 indices: ", i + 1);
            vetor[i]= input.nextInt();
            acumulador += vetor[i];
        }

        media = acumulador / vetor.length;
        System.out.printf("A media dos valores inseridos no vetor eh: %d\n", media);
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == media){
                System.out.printf("O valor do indice[%d] do vetor eh igual a media: %d, vetor: %d\n", i, media, vetor[i]);
            }else if(vetor[i] > media){
                System.out.printf("O valor do indice[%d] do vetor eh maior que a media: %d, vetor: %d \n", i, media, vetor[i]);
            }else{
                continue;
            }
        }
    }
}