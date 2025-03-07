package ex5;

public abstract class Animal {

    private String nome;
    private double peso;
    private String especie;
    
    private double valorDaConsulta = 50;
    private double valorDoExame = 50;

    public abstract void fazBarulho ();

    //tostring
    @Override
    public String toString() {
        return "Animal [nome=" + nome + ", peso=" + peso + ", especie=" + especie + "]";
    }

    //construtor
    public Animal(String nome, double peso, String especie) {
        this.nome = nome;
        this.peso = peso;
        this.especie = especie;
    }

    //getters
    public String getNome() {
        return nome;
    }
    public double getPeso() {
        return peso;
    }
    public String getEspecie() {
        return especie;
    }
    public double getValorDaConsulta() {
        return valorDaConsulta;
    }
    public double getValorDoExame() {
        return valorDoExame;
    }
    
}
