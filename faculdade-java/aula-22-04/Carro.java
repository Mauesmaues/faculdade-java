public class Carro extends Veiculo {
    private String motor;

    public Carro(String marca, String modelo, int ano, String motor, Cor cor) {
        super(marca, modelo, ano, cor);
        this.motor = motor;
    }

    public String mover(){
        return "Carro movendo";
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
}
