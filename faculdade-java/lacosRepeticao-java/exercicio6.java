/*Escreva um programa que escreva os 10 primeiros números da sequência de Fibonacci (1, 1, 2, 3, 5, 8,
13, 21, 34, 55).*/

class SequenciaFibonacci {
    public static void main(String[] args){
        int numeroOne = 0;
        int numeroTwo = 0;
        int sequencia = 0;
        for(int i = 1; i <= 10; i++){
            if(numeroOne == 0){
                numeroOne = i;
                System.out.printf("%d,", numeroOne);
            }else if(numeroTwo == 0){
                numeroTwo = numeroOne;
                System.out.printf("%d,", numeroTwo);
            }else{
                if(i == 10){
                    sequencia = numeroOne + numeroTwo;
                    System.out.printf("%d", sequencia);
                }else {
                    sequencia = numeroOne + numeroTwo;
                    numeroOne = numeroTwo;
                    numeroTwo = sequencia;
                    System.out.printf("%d,", sequencia);
                }
            }
        }
    }
}