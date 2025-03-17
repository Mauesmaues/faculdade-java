public class Pessoa {
    String nome;
    int idade;
    boolean falando = false;
    boolean comendo = false;

    public void status(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Falando: " + falando);
        System.out.println("Comendo: " + comendo);
    }

    public void falar(){
        if(comendo == true){
            System.out.println(this.nome + "Esta comendo e nao pode falar");
        }else if(this.falando == true){
            System.out.println(this.nome + "ja esta falando");
        }else{
            System.out.println(this.nome + " esta falando");
            this.falando = true;
        }
    }

    public void pararFala(){
        if(this.falando == true){
            System.out.println(this.nome + "parando de falar");
            this.falando = false;
        }else{
            System.out.println(this.nome + "nao esta falando");

        }
    }

    public void comer(){
        if(falando == true){
            System.out.println(this.nome + "esta falando e nao pode comer");
        }else if(this.comendo == true){
            System.out.println(this.nome + "ja esta comendo");
        }else {
            System.out.println(this.nome + " esta comendo");
            this.comendo = true;
        }
    }

    public void pararComer(){
        if(this.comendo == true){
            System.out.println(this.nome + "parando de comer");
            this.comendo = false;
        }else{
            System.out.println(this.nome + "nao esta falando");
        }
    }

    public void  whatFood(String alimento){
        if(this.comendo == true){
            System.out.println(this.nome + " vai comer " + alimento);
        }else{
            System.out.println(this.nome + "nao esta comendo");
        }
    }
}
