public class Gatoo extends Animall{
    public Gatoo(String nome, String porte) {
        super(nome, porte);
    }

    @Override
    public String correr() {
        return "Gato Correndo a " + getNome();
    }
}
