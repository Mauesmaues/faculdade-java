public class Banco {
    private int qntDinheiro;
    private Status status;
    Banco(int qntDinheiro) {
        this.qntDinheiro = qntDinheiro;
        this.status = Status.DESLIGADO;
    }

    public void ligar(){
        if(this.qntDinheiro <= 0){
            this.status = Status.SEM_DINHEIRO;
        }else{
            this.status = Status.PRONTO;
        }
    }

    public void desligar(){
        if(this.status != Status.DESLIGADO){
            this.status = Status.DESLIGADO;
        }else{
            System.out.println("O caixa ja esta desligado");
        }
    }

    public void sacar(int qnt){
        if(this.status == Status.DESLIGADO){
            System.out.println("Caixa desligado");
            return;
        }
        if(this.qntDinheiro >= qnt){
            this.qntDinheiro -= qnt;
            System.out.println("Saque realizado com sucesso!");
            if(this.qntDinheiro <= 0){
                this.status = Status.SEM_DINHEIRO;
            }
        }else{
            System.out.println("O saldo eh insificiente para saque!");
        }
    }

    public void depositar(int qnt){
            if(this.status == Status.PRONTO || this.status == Status.SEM_DINHEIRO){
                this.qntDinheiro += qnt;
                System.out.println("Depositado com sucesso!");
            }else{
                System.out.println("Caixa desligado");
            }
    }
}
