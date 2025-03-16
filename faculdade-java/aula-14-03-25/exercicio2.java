//Uma escola remunera seus professores por hora/aula ministrada.
//Escreva um método que calcule e retorne o salário de um professor,
//sendo que o valor hora/aula obedece aos seguintes critérios: 20,00 para o nível 1, 25,00 para o nível 2 e 30,00 para o nível 3.

import java.util.Scanner;
public class exercicio2 {
    public static float salario(float horas, int nivel){
        if(nivel == 1){
            return horas * 20f;
        }else if(nivel == 2){
            return horas * 25f;
        }else{
            return horas * 30f;
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite quantas horas lecionou esse mes: ");
        float horas = input.nextFloat();
        System.out.print("Digite seu nivel: ");
        int nivel = input.nextInt();
        float salario = salario(horas, nivel);
        System.out.printf("Seu salario eh: %.2f", salario);
    }
}
