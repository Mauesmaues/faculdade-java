/*Escreva um programa que mostre o resultado da série: 1/100 + 2/99 + 3/98 + 4/97 + ... + 100/1*/
class SerieDivididoPor{
    public static void main(String[] args){
        int divisor = 100, divisao = 0, soma = 0;
        for(int i = 1; i <= 100; i++){
            if(i == 100) {
                divisao = i / divisor;
                soma += divisao;
                System.out.printf("%d / %d + ", i, divisor);
                System.out.printf("= %d", soma);
            }else{
                divisao = i / divisor;
                soma += divisao;
                System.out.printf("%d / %d + ", i, divisor);
                divisor--;
            }
        }
    }
}