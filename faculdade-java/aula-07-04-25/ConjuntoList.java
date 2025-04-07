import java.util.Set;
import java.util.TreeSet;

public class ConjuntoList {
    public static void main(String[] args) {
        Set<Integer> ConjuntoLista = new TreeSet<>();
        ConjuntoLista.add(10);
        ConjuntoLista.add(20);
        ConjuntoLista.add(30);
        ConjuntoLista.add(40);
        ConjuntoLista.add(50);

        for(Integer i : ConjuntoLista){
            if(i == 30){
                System.out.println("30 esta no conjunto");
            }
        }

        if (ConjuntoLista.contains(20)) {
            System.out.println("20 ja esta no conjunto");
        }else {
            ConjuntoLista.add(20);
        }

        ConjuntoLista.add(60);
        ConjuntoLista.add(70);

        ConjuntoLista.remove(40);
        System.out.println(ConjuntoLista);
        System.out.println(ConjuntoLista.size());

        ConjuntoLista.clear();
        System.out.println(ConjuntoLista);

    }
}
