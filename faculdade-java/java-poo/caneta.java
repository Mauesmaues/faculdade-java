public class caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public caneta(String m, String c, float p){
       this.modelo = m;
       this.cor = c;
       this.setPonta(p);
       this.tampar();
    }

    void status() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }

    public String getModelo() {
        return this.modelo;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }
}



