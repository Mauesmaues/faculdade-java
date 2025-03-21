public class execute {
    public static void main(String[] args){
        Pessoa1 marcos = new Pessoa1("marcos", 18, 76, 1.80f);
        marcos.showPessoa();
        marcos.envelhecer();
        marcos.engordar(4);
        marcos.showPessoa();
    }
}
