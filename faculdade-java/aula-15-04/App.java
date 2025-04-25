import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args){
        System.out.println("Aula Herança");

        Gato gato = new Gato("Pipoca", "Miau");

        System.out.println(gato);

        Cachorro cachorro = new Cachorro("Stella", "AuAu");
        System.out.println(cachorro);

        Animal gato2 = new Gato("Sininho", "Miau");
        System.out.println(gato2);

        List<Animal> animais = new ArrayList<>();
        animais.add(gato);
        animais.add(cachorro);
        animais.add(gato2);

        for(Animal animalTemp : animais){
            System.out.println(animalTemp.emitirSom());

            if(animalTemp instanceof Cachorro){
                Cachorro cachorroTemp = (Cachorro) animalTemp;
                System.out.println(cachorroTemp.abanarRabo());
            }
        }
    }
}
