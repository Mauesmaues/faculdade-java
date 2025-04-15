public abstract class Animal {
    protected String nome, som;
    protected boolean dormindo, fome;

    public Animal(String nome, String som) {
        this.nome = nome;
        this.som = som;
        this.dormindo = false;
        this.fome = false;
    }

    public abstract String emitirSom();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public boolean isFome() {
        return fome;
    }

    public void setFome(boolean fome) {
        this.fome = fome;
    }

    public boolean isDormindo() {
        return dormindo;
    }

    public void setDormindo(boolean dormindo) {
        this.dormindo = dormindo;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "dormindo=" + dormindo +
                ", nome='" + nome + '\'' +
                ", som='" + som + '\'' +
                ", fome=" + fome +
                '}';
    }
}
