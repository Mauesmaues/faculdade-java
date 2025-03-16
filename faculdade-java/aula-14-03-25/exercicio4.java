//Escreva um método que solicite ao usuário o nome de um produto,
//o preço desse produto e o valor em dinheiro entregue ao vendedor.
//Em seguida, deve ser mostrada uma mensagem baseada no seguinte exemplo:
//"Você comprou um produto (mouse) por R$ 185,00 e entregou ao vendedor R$ 200,00 em dinheiro.
//Você vai receber R$ 15,00 de troco. Volte sempre!".
import java.util.Scanner;
public class exercicio4 {
    public static void troco(String produto, float preco, float pagamento){
        System.out.printf("Voce comprou um produto (%s) por %f e entregou ao vendedor %f em dinheiro.", produto, preco, pagamento);
        float troco = pagamento - preco;
        System.out.printf("Voce vai receber R$ %.2f de troco. Volte sempre!", troco);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String produto = input.nextLine();
        System.out.print("Digite o valor do produto: ");
        float valor = input.nextFloat();
        System.out.print("Digite o valor dado para o pagamento: ");
        float pagamento = input.nextFloat();
        troco(produto, valor, pagamento);

    }
}
