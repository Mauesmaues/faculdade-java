import java.util.Scanner;

class NumerosParesExistentes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero para saber quantos numeros pares existem entre 1 e ele;");
        int num = input.nextInt();
        int aux = 0;
        for(int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d\n", i);
                aux++;
            }else{
                continue;
            }
        }
        System.out.printf("Foram encontrados %d numero pares.\n", aux);
    }
}