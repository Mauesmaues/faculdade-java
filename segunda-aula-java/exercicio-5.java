/*Escreva um programa que calcule e mostre o consumo médio e a autonomia que um veículo ainda
teria antes de um abastecimento de combustível. Considere que o veículo sempre seja abastecido até
encher o tanque e que são fornecidas apenas a capacidade do tanque, a quantidade de litros
abastecidos e a quilometragem percorrida desde o último abastecimento.*/
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual a capacidade do tanque:");
        float capacidade = input.nextFloat();

        System.out.print("Qual a quantidade de litros abastecidas");
        float litrosAbastecidos = input.nextFloat();

        System.out.print("Qual a quilometragem percorrida desde o ultimo abastecimento:");
        float percorrido = input.nextFloat();

        float consumoM = percorrido / litrosAbastecidos;

        float autonomia = (capacidade - litrosAbastecidos) * consumoM;

        System.out.printf("A autonomia restante eh: %f", autonomia);
        input.close();
    }
}
