import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int custoDia = 70;
        System.out.print("Quantos km foram percorridos?:");
        int kmPercorridos = input.nextInt();

        System.out.print("Por quantos dias o carro foi alugado:");
        int diasAlugados = input.nextInt();

        int valorPagar = diasAlugados * custoDia;
        valorPagar += kmPercorridos * 0.15f;
        System.out.printf("O valor total a pagar eh: %d", valorPagar);
        input.close();

    }
}