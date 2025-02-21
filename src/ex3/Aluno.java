package ex3;

public class Aluno {

    private String curso;
    private float mensalidade;

    //mensalidade ................
    public void pagaMensalidade () {
        
    }

    //construtor
    public Aluno(String curso, float mensalidade) {
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
