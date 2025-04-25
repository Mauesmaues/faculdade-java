import java.util.List;
import java.util.Optional;

public abstract class AnimalFactory {
    private static final List<String> PORTES_VALIDOS = List.of("pequeno", "médio", "grande");

    public static Optional<Cachorroo> criarCachorro(String nome, String porte, int idade){
        if(nome.isBlank() || nome == null){
            return Optional.empty();
        }
        if(!PORTES_VALIDOS.contains(porte)) return Optional.empty();
        if(idade < 0) return Optional.empty();

        return Optional.of(new Cachorroo(nome, porte, idade));
    }

    public static Optional<Gatoo> criarGato(String nome, String porte){
        if(nome.isBlank() || nome == null){
            return Optional.empty();
        }
        if(!PORTES_VALIDOS.contains(porte)) return Optional.empty();

        return Optional.of(new Gatoo(nome, porte));
    }

}
