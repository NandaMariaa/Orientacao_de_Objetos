public class Cachorro {

    private RacasDeCachorro raca;
    private String nome;
    private byte idade;
 
    public RacasDeCachorro getRaca() {
        return raca;
    }
    public void setRaca(RacasDeCachorro raca) {
        this.raca = raca;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public byte getIdade() {
        return idade;
    }
    public void setIdade(byte idade) {
        this.idade = idade;
    }
 
    public Cachorro(RacasDeCachorro raca, String nome, byte idade) {
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
    }
 
    @Override
    public String toString() {
        return "Cachorro [raca=" + raca + ", nome=" + nome + ", idade=" + idade + "]";
    }
    
}