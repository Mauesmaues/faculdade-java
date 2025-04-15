public final class Cachorro extends Animal{
    public Cachorro(String nome, String som) {
        super(nome, som);
    }

    public String abanarRabo(){
        return "Abanando rabo";
    }
    @Override
    public String emitirSom() {
        return "AuAu";
    }

    @Override
    public String toString() {
        return "Cachorro{} " + super.toString();
    }
}

