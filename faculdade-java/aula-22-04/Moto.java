public class Moto extends Veiculo{
    private String cilindrada;

    public Moto(String cilindrada, String marca, String modelo, int ano, Cor cor){
        super(marca, modelo, ano, cor);
        this.cilindrada = cilindrada;
    }

    public String mover(){
        return "Moto movendo";
    }

    public String empinar(){
        return "Moto " + this.marca + " " + this.modelo + "esta empinando";
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }
}
