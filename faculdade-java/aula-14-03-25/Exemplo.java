import java.util.Scanner;
public class Exemplo {
    public static void mensagem(String nome, int idade){
        System.out.printf("Ola %s que legal q vc tem %d", nome, idade);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor digite seu nome:");
        String nome = input.nextLine();
        System.out.println("Digite sua idade");
        int idade = input.nextInt();
        mensagem(nome, idade);
    }
}
