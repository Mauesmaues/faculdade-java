/*A definição de "amplitude" em Estatística é dada pela grandeza numérica resultante da diferença
entre o maior valor e o menor valor do conjunto de valores de uma amostra. Escreva programa que
leia uma sequencia de números reais positivos terminada em zero (o número zero não deve ser
processado pois serve para marcar o final da entrada de dados). O programa deve determinar e
mostrar o valor da amplitude estatística dos valores. Exemplo: para a sequencia 4.5, 5.2, 1.7, 1.3, 1.9,
2.2, 8.3, 9.1, 5.4 e 0, teremos o resultado de 7.8 como amplitude*/
import java.util.Scanner;
class Amplitude{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float maior = 0, menor = 99999, amplitude;
        float numero;
        do{
            do {
                System.out.print("Digite um valor real e positivo para juntar ao conjunto e determinar sua amplitude:");
                numero = input.nextFloat();
                if(numero < 0){
                    System.out.print("Valor negativo inserido!");
                }
            }while(numero < 0);
            if(numero < menor && numero != 0){
                menor = numero;
            }else if(numero > maior){
                maior = numero;
            }else {
                continue;
            }
        }while(numero != 0 );
        amplitude = maior - menor;
        System.out.printf("Amplitude: %.1f", amplitude);
        input.close();
    }
}