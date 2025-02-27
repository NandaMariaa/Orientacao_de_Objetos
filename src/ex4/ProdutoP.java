package ex4;

public class ProdutoP {

    private int dia;
    private int validade;






    private boolean isValido () {
        return validade > dia;
    }


    //construtor
    public ProdutoP(int dia, int validade, String nome, double preço, int id, int qnt) {
        super(nome, preço, id, qnt);
        this.dia = dia;
        this.validade = validade;
    }

    //getters and setters
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getValidade() {
        return validade;
    }
    public void setValidade(int validade) {
        this.validade = validade;
    }
    
    
}
