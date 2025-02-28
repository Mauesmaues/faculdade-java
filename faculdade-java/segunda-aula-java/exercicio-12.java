
import java.util.Scanner;

class Doze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero ineiro de 0 a 9 e receba ele em extenso:");
        int numero = input.nextInt();
        if(numero == 0){
            System.out.print("Zero");
        }else if(numero == 1){
            System.out.print("One");
        }else if(numero == 2){
            System.out.print("Two");
        }else if(numero == 3){
            System.out.print("Three");
        }else if(numero == 4){
            System.out.print("Four");
        }else if(numero == 5){
            System.out.print("Five");
        }else if(numero == 6){
            System.out.print("Six");
        }else if(numero == 7){
            System.out.print("Seven");
        }else if(numero == 8){
            System.out.print("eight");
        }else if(numero == 9){
            System.out.print("nine");
        }else{
            System.out.print("numero fora de intervalo entre 0 e 9");
        }
        input.close();
    }
}