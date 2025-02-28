/*Escreva um programa que efetue a leitura de um número inteiro e apresente se esse número é
divisível por 2 e divisível por 3. */
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero para descobrir se ele é divisivel por 2 e 3");
        int num = input.nextInt();

        if(num % 6 == 0){
            System.out.print("o numero eh divisivel por 2 e 3 ");
        }else{
            System.out.print("O numero nao eh divisil por 2 e 3");
        }

    }
}