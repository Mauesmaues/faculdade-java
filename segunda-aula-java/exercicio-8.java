import java.util.Scanner;
class Main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num, numMenor = 99, numMaior = 0, aux;

        System.out.print("Digite um numero");
        numMenor = input.nextInt();
        System.out.print("Digite um numero");
        num = input.nextInt();
        if(num < numMenor){
            numMaior = numMenor;
            numMenor = num;
        }else{
            numMaior = num;
        }
        System.out.print("Digite um numero");
        num = input.nextInt();
        if(num > numMaior){
            aux = numMaior;
            numMaior = num;
            num = aux;
        }else if(num < numMenor){
            aux = numMenor;
            numMenor = num;
            num = aux;
        }

        System.out.printf("A ordem crescente dos numeros digitados eh: %d, %d, %d", numMenor, num, numMaior);
        input.close();
    }
}
