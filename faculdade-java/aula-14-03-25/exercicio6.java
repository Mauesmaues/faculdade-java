//Escreva um método que retorne o maior valor entre três números inteiros.
import java.util.Random;
public class exercicio6 {
    public static int maior(int ...vetor){
        int maior = 0;
        for(int v : vetor){
            if(v > maior){
                maior = v;
            }else continue;
        }
        return maior;
    }

    public static void main(String[] args){
        Random rand = new Random();
        int[] vetor = new int[3];
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = rand.nextInt(100);
        }
        for(int v : vetor){
            System.out.print("|" + v);
        }
        int maior = maior(vetor);
        System.out.printf("\nO maior elemento do vetor eh: %d", maior);

    }
}
