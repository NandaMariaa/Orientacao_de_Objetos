package ex3;

public class Pessoa {

    
    //atributos
    protected static int ultimoID = 0;
    private String nome;
    private int idade;
    private int id;
    private boolean matriculaAtiva;

    //
    @Override
    public String toString () {
     return " Nome: " + this.nome + 
     " / idade " + this.idade + 
     " / ID: = "  + this.id +
     " / Matriculado: " + this.matriculaAtiva;

    }

    //ativaMatricula...............
    public void fazMatricula() {
        setMatriculaAtiva(true);
    }

    //desativaMatricula........
    public void desativaMatricula() {
        setMatriculaAtiva(false);
    }

    //aniversário..............
    public void fazAniversario(){
        setIdade(getIdade()+1);
    }

    //construtor...............

    public Pessoa(String nome, int idade, boolean matriculaAtiva) {

        this.nome = nome;
        this.idade = idade;
        this.matriculaAtiva = matriculaAtiva;
        this.id = ultimoID++;

    }
    
    //getters e setters.........

    //nome

    public String getNome() {
        return this.nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    //idade

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    //id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //matriculaAtiva

    public boolean isMatriculaAtiva() {
        return matriculaAtiva;
    }

    public void setMatriculaAtiva(boolean matriculaAtiva) {
        this.matriculaAtiva = matriculaAtiva;
    }

}
