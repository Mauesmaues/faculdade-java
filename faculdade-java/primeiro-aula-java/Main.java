import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.print("Hello and welcome!");
//
//        int velocidade_maxima = 80;
//        Scanner input = new Scanner(System.in);
//        System.out.print("Digite uma velocidade:");
//        int numeroInput = input.nextInt();
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("i = " + i);
//        }
//        for(int i = 1; i <= numeroInput; i++){
//            velocidade_maxima++;
//            System.out.print("\nVelocidade atual =" + velocidade_maxima);
//            if(velocidade_maxima == 120){
//                System.out.print("\nvelocidade maxima da via atingida = " + velocidade_maxima);
//                i = numeroInput;
//                System.out.print("\nEncerrando aceleracao");
//            }
//        }
//    }
//}

class Main{  public static void main(String[] args){Scanner input = new Scanner(System.in);

    System.out.print("Digite uma quantidade de horas");
    int horas = input.nextInt();
    System.out.print("Digite uma quantidade de minutos");
    int minutos = input.nextInt();
    System.out.print("Digite uma quantidade de segundos");
    int segundos = input.nextInt();

    int total_segundos = horas * 3600 + minutos * 60 + segundos;
    System.out.print("\nTotal segundos: " + total_segundos);

    System.out.print("\nDigite um numero:");
    int numeroRecebido = input.nextInt();
    System.out.printf("\nO antecessor de %d eh %d", numeroRecebido, (numeroRecebido - 1));
    System.out.printf("\n O sucessor de %d eh %d", numeroRecebido, (numeroRecebido + 1));

//    Uma fabrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e
//    garrafa de 2 litros. Tomando por base que um comerciante compre uma determinada quantidade de
//    cada um dos formatos disponíveis, escreva um programa para calcular quantos litros de refrigerante
//    ele comprou.
    System.out.print("Quantas latas de 350ml foram compradas:");
    int lata = input.nextInt();
    System.out.print("Quantas garrafas de 600ml foram compradas:");
    int garrafa600 = input.nextInt();
    System.out.print("Quantas garrafas de 2l foram compradas:");
    int garrafa2l = input.nextInt();

    float totalLitros = lata * 0.35f+ garrafa600 * 0.6f + garrafa2l * 2;
    System.out.printf("%.3f", totalLitros);

    input.close();

  } }




