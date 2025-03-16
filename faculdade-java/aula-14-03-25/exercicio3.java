//Escreva um método que calcule e retorne o valor da conta de energia a ser paga de acordo com a quantidade de kW consumidos,
// sendo que o valor do kW é 0,60 (pessoa física), 0,48 (comércio) e 1,29 (indústria).
import java.util.Scanner;
public class exercicio3 {
    public static float contaEnergia(float kw, String tipo){
        if(tipo.equals("fisica")){
            return kw * 0.6f;
        }else if(tipo.equals("comercio")){
            return kw * 0.48f;
        }else if(tipo.equals("industria")){
            return kw * 1.29f;
        }else{
            return 0;
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Qual tipo de consumo? Sendo eles:\nfisica\ncomercio\nindustria: ");
        String tipo = input.nextLine();
        System.out.print("Quantos kw foram consumidos?");
        float kw = input.nextFloat();
        float contaEne = contaEnergia(kw, tipo);
        System.out.printf("Sua conta eh: %.2f", contaEne);
    }
}
