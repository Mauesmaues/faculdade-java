public class AppBanco {
    public static void main(String[] args){
        Banco banco = new Banco(10);
        banco.desligar();
        banco.ligar();
        banco.sacar(11);
        banco.sacar(10);
        banco.desligar();
        banco.sacar(10);
        banco.ligar();
        banco.sacar(10);
        banco.desligar();
        banco.depositar(100);
        banco.ligar();
        banco.depositar(100);
    }
}
