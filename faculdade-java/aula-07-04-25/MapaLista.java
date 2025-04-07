import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapaLista {
   public static void main(String[] args) {
       Map<Integer, Aluno> mapaAlunos = new TreeMap<>();
       mapaAlunos.put(1, new Aluno(1, "Marcos", "ads", 10));
       mapaAlunos.put(2, new Aluno(2, "douglas", "ads", 8));
       mapaAlunos.put(3, new Aluno(3, "thiago", "ads", 4));
       mapaAlunos.put(4, new Aluno(1, "Eren", "ads", 7));
       mapaAlunos.put(5, new Aluno(1, "Naruto", "ads", 9));

       for(Aluno aluno : mapaAlunos.values()){
           System.out.println(aluno.toString());
       }
       System.out.println(mapaAlunos);
   }

}

class Aluno {
    public String nome;
    public int matricula;
    public String disciplina;
    public double nota;

    Aluno(int matricula, String nome, String disciplina, double nota) {
        this.matricula = matricula;
        this.nome = nome;
        this.disciplina = disciplina;
        this.nota = nota;

    }

    public String toString() {
        return nome + " " + matricula + " " + disciplina + " " + nota;
    }
}
