import java.util.Scanner;

class SomaUsuario{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero;
        int soma = 0;
        do{
            System.out.print("Digite um numero:");
            numero = input.nextInt();
            soma += numero;
            if(numero == 0){
                System.out.print("encerrando entradas e calculando entradas fornecidas\n");
            }
        }while(numero != 0);
        System.out.printf("Soma dos numeros digitados: %d", soma);
    }
}