public class Cachorroo extends Animall {
    private int idade;

    public Cachorroo(String nome, String porte, int idade) {
        super(nome, porte);
        this.idade = idade;
    }

    @Override
    public String emitirSom() {
        return super.emitirSom();
    }

    public String emitirSom(String som) {
        return "Novo som " + som;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    @Override
    public String correr() {
        return "";
    }

    public String correr(int velocidade) {
        return "Cachorro correndo a " + velocidade;
    }

    @Override
    public String toString() {
        return "Cachorroo{" +
                "idade=" + idade +
                "} " + super.toString();
    }
}
