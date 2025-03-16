//Escreva um método que solicite ao usuário o nome e o preço de um produto.
//Em seguida, deve ser mostrada uma mensagem baseada no seguinte exemplo:
//"Você comprou um produto (mouse) por R$ 185,00 e acaba de ganhar um desconto de 10%.
//Assim você vai pagar apenas R$ 166,50 pelo seu produto. Volte sempre!".
import java.util.Scanner;
public class exercicio5 {
    public static void desconto(String produto, float valor){
        float desconto = valor - valor * 10f / 100f;
        System.out.printf("Voce comprou um ( %s ) por %.2f e acaba de ganhar um desconto de 10.\n", produto, valor);
        System.out.printf("Assim voce vai pagar apenas R$ %.2f pelo seu produto. Volte sempre!", desconto);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String produto = input.nextLine();
        System.out.print("Digite o valor do produto: ");
        float valor = input.nextFloat();
        desconto(produto, valor);
    }
}
