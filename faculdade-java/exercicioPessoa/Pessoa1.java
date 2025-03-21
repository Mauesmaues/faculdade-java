//Crie uma classe que modele uma pessoa.
//A classe deve possuir os seguintes atributos: nome, idade, peso e altura.
//Os métodos são os seguintes: envelhecer (um ano por vez),
//engordar (informar quantidade de quilos) e emagrecer (informar quantidade de quilos).
//Por padrão, a cada ano que uma pessoa envelhece, sendo a idade dela menor que 21 anos, ela deve crescer 1 cm.


public class Pessoa1 {
    int idadePessoa = 0;
    String nomePessoa;
    float peso;
    float altura;

     public Pessoa1(String nome, int idade, float peso, float altura){
            this.idadePessoa = idade;
            this.nomePessoa = nome;
            this.peso = peso;
            this.altura = altura;
     }

     public void envelhecer(){
         this.idadePessoa++;
         if(this.idadePessoa < 21){
             this.altura += 0.01f;
             System.out.println("envelheceu 1 ano e cresceu 1cm");
         }else{
             System.out.println("envelheceu 1 ano");
         }
     }

     public void engordar(float kg){
         this.peso += kg;
     }

     public void emagrecer(float kg){
         this.peso -= kg;
     }

     public void showPessoa(){
         System.out.println(this.nomePessoa);
         System.out.println(this.peso);
         System.out.println(this.altura);
         System.out.println(this.idadePessoa);
     }
}
