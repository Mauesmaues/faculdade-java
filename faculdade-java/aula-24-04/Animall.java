public abstract class Animall {
    private String nome, porte;

    public Animall(String nome, String porte) {
        this.nome = nome;
        this.porte = porte;
    }

    public String emitirSom(){
        return "Som Generico";
    }

    public abstract String correr();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    @Override
    public String toString() {
        return "Animall{" +
                "nome='" + nome + '\'' +
                ", porte='" + porte + '\'' +
                '}';
    }
}
