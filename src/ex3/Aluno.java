package ex3;

public class Aluno extends Pessoa {

    private String curso;
    private float mensalidade;


    //mensalidade ................
    public void pagaMensalidade () {

       if(isMatriculaAtiva()) {
        System.out.println("Pagando valor de R$ " + this.mensalidade + " 0,00");
       } else {
        System.out.println("Aluno não Matriculado.");
       }
        
    }

    //
    @Override
    public String toString () {
        return "Aluno: " +
         " / Curso: " + this.curso +
         " / Valor Mensalidade " + this.mensalidade +
        super.toString();

    }

    //construtor
    public Aluno(String curso, float mensalidade, String nome, int idade, boolean matriculaAtiva) {
        super (nome, idade, matriculaAtiva);
        this.curso = curso;
        this.mensalidade = mensalidade;
    }
    

    //getters and setters ........
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }
    
}
