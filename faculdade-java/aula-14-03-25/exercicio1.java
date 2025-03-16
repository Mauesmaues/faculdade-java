//Escreva um método que receba o nome e as 3 notas de um aluno e mostre o nome do aluno e a sua média aritmética.
import java.util.Scanner;
public class exercicio1 {
    public static float media(float n1, float n2, float n3){
        return (n1 + n2 + n3) / 3;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o seu nome:");
        String nome = input.nextLine();
        System.out.print("Digite sua primeira nota");
        float n1 = input.nextFloat();
        System.out.print("Digite sua segunda nota");
        float n2 = input.nextFloat();
        System.out.print("Digite sua terceira nota:");
        float n3 = input.nextFloat();
        float medi = media(n1, n2, n3);
        System.out.printf("%s a sua media eh: %.2f", nome, medi);
    }
}
