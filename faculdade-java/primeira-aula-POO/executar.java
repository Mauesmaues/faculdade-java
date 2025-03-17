public class executar {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.nome = "Marcos";
        p2.nome = "Pedro";
        p1.idade = 18;
        p2.idade = 21;
        p1.status();
        p2.status();
        p1.falar();
        p2.pararFala();
        p1.comer();
        p2.pararComer();
        p1.whatFood("bacon");
        p2.whatFood("cherry");
        p1.status();
        p2.status();


    }
}
