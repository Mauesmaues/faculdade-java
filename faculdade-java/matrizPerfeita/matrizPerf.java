import java.util.Random;
public class matrizPerf {
    public static void main(String... args){
        int[][]  matriz= new int[3][3];
        Random rand = new Random();
        int num, usado = 0, indiceUsados = 0;
        int[] numerosUsados = new int[9];
        int[] armazenaSomas = new int[8];
        boolean diferente = false;

        for(int i = 0;i <  matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                num = rand.nextInt(10);
                for(int s = 0; s < 9; s++){
                    if(numerosUsados[s] == num){
                        usado++;
                        break;
                    }else continue;
                }
                if(usado == 0){
                    matriz[i][j] = num;
                    numerosUsados[indiceUsados] = num;
                    indiceUsados++;
                }else{
                    usado = 0;
                    j--;
                }
            }
        }
        for(int i = 0;i <  matriz.length; i++){
            for(int j = 0;j <  matriz[0].length; j++){
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println(" ");
        }
            int aux = 2;
            for(int j = 0; j < matriz.length; j++){
                armazenaSomas[0] += matriz[0][j];
                armazenaSomas[1] += matriz[1][j];
                armazenaSomas[2] += matriz[2][j];
                armazenaSomas[3] += matriz[j][0];
                armazenaSomas[4] += matriz[j][1];
                armazenaSomas[5] += matriz[j][2];
                armazenaSomas[6] += matriz[j][j];
                armazenaSomas[7] += matriz[aux][j];
                aux--;
            }

        for(int i = 0; i < armazenaSomas.length; i++) {
                System.out.println(armazenaSomas[i]);
        }

        for(int s : armazenaSomas){
            for(int i = 0; i < armazenaSomas.length; i++){
                if(s != armazenaSomas[i]){
                    diferente = true;
                }
            }
        }

        if(diferente == false){
            System.out.println("eh magico");
        }else{
            System.out.println("nao eh magico");
        }

        indiceUsados = 0;

//        for(int  i = 0; i < matriz.length; i++){
//            for (int j = 0; j < matriz.length; j++){
//                armazenaSomas[indiceUsados] += matriz[i][j];
//
//            }
//            indiceUsados++;
//            for (int l2 = 0; l2 < matriz.length; l2++){
//                armazenaSomas[indiceUsados] += matriz[l2][i];
//            }
//            indiceUsados++;
//            for(int y = 0; y < matriz.length; y++){
//                armazenaSomas[indiceUsados] += matriz[y][y];
//            }
//            indiceUsados++;
//            int aux = 0;
//            for(int x = matriz.length; x > 0; x--){
//
//                armazenaSomas[indiceUsados] += matriz[aux][x];
//                aux++;
//            }
//            System.out.println(armazenaSomas[indiceUsados]);

        }
    }

