/*Escreva um programa que apresente na tela a tabuada de um número lido do teclado. Por exemplo,
considerando que o número lido é 2, o formato da apresentação deve ser o seguinte*/
import java.util.Scanner;
class Tabuada{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero pra receber a tatuaba de 1 a 10 dele;");
        int numero = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            int tabuada = numero * i;
            System.out.printf("%d x %d = %d\n", numero, i, tabuada);
        }
        input.close();
    }
}