public class Gato extends Animal {

    public Gato(String nome, String som) {
        super(nome, som);
    }

    @Override
    public String emitirSom() {
        return "MiauMiau";
    }


    @Override
    public String toString() {
        return "Gato: " + super.toString();
    }
}
