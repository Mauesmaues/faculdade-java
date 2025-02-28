
/*Em uma certa papelaria, até 100 folhas, a cópia do xerox custa R$ 0,25 e, acima de 100 folhas, cada
cópia adicional custa R$ 0,20. Escreva um programa que dado o número total de cópias, informe o
valor a ser pago */

import java.util.Scanner;

class Onze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float totalcompra = 0;
        System.out.print("Informe a quantidade de copias que deseja:");
        int numeroFolhas = input.nextInt();
        if (numeroFolhas > 100) {
            float primeiraCem = 100 * 0.25f;
            float folhasAdd = (numeroFolhas - 100) * 0.20f;
            totalcompra = primeiraCem + folhasAdd;
        } else {
            totalcompra = numeroFolhas * 0.25f;
        }
        System.out.printf("Total a pagar: %.2f", totalcompra);
    }
}
