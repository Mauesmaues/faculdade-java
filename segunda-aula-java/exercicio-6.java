/*Escreva um programa que solicite do usuário o valor de um saque em caixa eletrônico, sendo que
estarão disponíveis cédulas de 5, 10, 20, 50 e 100. O programa deve apresentar a menor quantidade
de cédulas possível de acordo com o saque. Exemplos:
400,00: 4 cédulas de 100, 0 cédulas de 50, 0 cédulas de 20, 0 cédulas de 10 e 0 cédulas de 5.
350,00: 3 cédulas de 100, 1 cédulas de 50, 0 cédulas de 20, 0 cédulas de 10 e 0 cédulas de 5.
385,00: 3 cédulas de 100, 1 cédula de 50, 1 cédula de 20, 1 cédula de 10 e 1 cédula de 5.
/* Alimenta a matriz */
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual o valor do saque?");
        int valorSaque =  input.nextInt();

        System.out.printf("notas de 100: %d", valorSaque / 100);
        valorSaque = valorSaque % 100;

        System.out.printf("notas de 50: %d", valorSaque / 50);
        valorSaque =  valorSaque % 50;

        System.out.printf("notas de 20: %d", valorSaque / 20);
        valorSaque =  valorSaque % 20;

        System.out.printf("notas de 10: %d", valorSaque / 10);
        valorSaque = valorSaque % 10;

        System.out.printf("notas de 5 %d", valorSaque / 5);
        input.close();
    }
}