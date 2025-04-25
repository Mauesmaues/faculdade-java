import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalController {
    private List<Animall> animals = new ArrayList<Animall>();

    public AnimalController(List<Animall> animals) {
        this.animals = animals;
    }

    public void adicionarAnimal(Animall animal) {
        this.animals.add(animal);
    }

    public List<String> listarSom() {
        return animals.stream().map(animal -> animal.getNome() + "está " + animal.emitirSom()).toList();
    }

    public List<String> animaisCorrendo() {
        return animals.stream().map(animal -> animal.getNome() + "está " + animal.correr()).toList();
    }

    public List<String> cachorrosCorrendo() {
        return animals.stream().filter( a -> a instanceof Cachorroo)
                .map(animal -> animal.getNome() + "está " + animal.correr())
                .toList();
    }

    public List<String> cachorrosCorrendo(int velocidade) {
        return animals.stream().filter( a -> a instanceof Cachorroo)
                .map(animal -> {
                    Cachorroo c = (Cachorroo) animal;
                    return c.getNome() + "está " + c.correr(velocidade);})
                .toList();
    }

    public List<String> gatosCorrendo() {
        return animals.stream().filter( a -> a instanceof Gatoo)
                .map(animal -> animal.getNome() + "está " + animal.correr())
                .toList();
    }

    public List<Cachorroo> listarCachorros() {
        return animals.stream()
                .filter(a -> a instanceof Cachorroo)
                .map(c -> (Cachorroo) c).toList();
    }

    public List<Gatoo> listarGatos() {
        return animals.stream()
                .filter(a -> a instanceof Gatoo)
                .map(c -> (Gatoo) c).toList();
    }


}
