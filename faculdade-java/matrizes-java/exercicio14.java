/*Escreva um programa que leia uma matriz de 5 x 5 elementos e, utilizando estruturas de repetição,
apresente na tela o menor valor da matriz, o maior valor da matriz, a soma dos valores da matriz e a
média dos valores da matriz*/
import java.util.Random;
class MatrizUltimo{
    public static void main(String[] args){
        Random rand = new Random();
        int matriz[][] = new int[5][5];
        int soma = 0, numeroEle = 0, menor = 999, maior = 0, media;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                matriz[i][j] = rand.nextInt(90);
                System.out.printf("%d ", matriz[i][j]);
                soma += matriz[i][j];
                numeroEle++;
                if(matriz[i][j] < menor){
                    menor = matriz[i][j];
                }else if(matriz[i][j] > maior){
                    maior = matriz[i][j];
                }else continue;
            }
            System.out.print("\n");
        }
        media = soma / numeroEle;
        System.out.printf("A soma da matriz eh: %d\n", soma);
        System.out.printf("O maior valor da matriz eh: %d\n", maior);
        System.out.printf("O menor valor da matriz eh: %d\n", menor);
        System.out.printf("A media da matriz eh: %d\n", media);

    }
}