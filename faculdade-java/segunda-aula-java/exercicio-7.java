import java.util.Scanner;


class Sete{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o um numero inteiro:");
        int OneNumber = input.nextInt();

        System.out.print("Digite outro numero inteiro:");
        int SecondNumber = input.nextInt();

        if (OneNumber > SecondNumber) {
            System.out.printf("O numero %d eh maior que o numero %d\n", OneNumber, SecondNumber);
        }else{
            System.out.printf("O numero %d eh maior que o numero %d\n", SecondNumber, OneNumber);
        }
        input.close();
    }
}
