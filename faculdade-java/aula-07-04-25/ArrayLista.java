import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLista {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(21);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        for(int s : arrayList){
            if(s == 30){
                System.out.println("30 esta presente na lista");
            }
            if(s == 15){
                System.out.println("15 esta presente na lista");
            }else {
                System.out.println("15  nao esta presente na lista");
            }
        }
        System.out.println(arrayList);

        arrayList.add(60);
        arrayList.add(3);
        System.out.println(arrayList);

        int tamanhoArrayList = arrayList.size();
        Boolean ordenando;
        //ordenando crescente
        do {
            ordenando = false;
            for (int i = 0; i < tamanhoArrayList - 1; i++) {
                int aux;
                if (arrayList.get(i) > arrayList.get(i + 1)) {
                    aux = arrayList.get(i);
                    arrayList.set(i, arrayList.get(i + 1));
                    arrayList.set(i + 1, aux);
                    ordenando = true;
                }
            }
        }while(ordenando);

        System.out.println(arrayList);

        //ordenando decrescente
        do {
            ordenando = false;
            for (int i = 0; i < tamanhoArrayList - 1; i++) {
                int aux;
                if (arrayList.get(i) < arrayList.get(i + 1)) {
                    aux = arrayList.get(i);
                    arrayList.set(i, arrayList.get(i + 1));
                    arrayList.set(i + 1, aux);
                    ordenando = true;
                }
            }
        }while(ordenando);

        System.out.println(arrayList);

        List<Integer> listaPares = new ArrayList<>();

        for(int s : arrayList){
            if(s % 2 == 0){
                listaPares.add(s);
            }
        }
        System.out.println(listaPares);
        listaPares.remove(Integer.valueOf(10));
        System.out.println(listaPares);

        arrayList.clear();
        listaPares.clear();

        System.out.println(arrayList);
        System.out.println(listaPares);

    }
}
