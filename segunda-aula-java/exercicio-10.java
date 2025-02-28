
/*Escreva um programa que efetue a leitura de um número inteiro e apresente se esse número é
divisível por 2 ou divisível por 7.*/
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero para descobrir se ele e divisivel por 2 e 7:");
        int num = input.nextInt();
        if (num % 14 == 0) {
            System.out.print("O numero e divisivel por 2 e 7");
        } else {
            System.out.print("o numero nao eh divisivel por 2 e 7");
        }
        input.close();
    }
}
