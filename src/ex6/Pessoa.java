 package ex6;

public abstract class Pessoa {

    // atributos
    private String nome;
    private int idade;
    private Acessos acesso;

    // enum
    public enum Acessos {

        areasDeEnsino,
        areasAdministrativas,
        completo
    }
   
    //ovo
    @Override
    public String toString() {

        return "Pessoa [Nome: " + nome + ", Idade: " + idade + ", Acesso: " + acesso + "]";
    }


    // construtor
    public Pessoa(String nome, int idade, Acessos acesso) {

        this.nome = nome;
        this.idade = idade;
        this.acesso = acesso;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Acessos getAcesso() {
        return acesso;
    }

    public void setAcesso(Acessos acesso) {
        this.acesso = acesso;
    }
}