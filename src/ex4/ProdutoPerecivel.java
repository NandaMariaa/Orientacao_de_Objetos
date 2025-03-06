package ex4;

public class ProdutoPerecivel extends Produto {

    private int dia;
    private int validade;


    private boolean isValido () {
        return validade > dia;
    }

    public void mostraValidade () {
        if ( isValido() ) {
            System.out.println(getNome() + " - Produto dentro da validade.");
        } else {
            System.out.println(getNome() + " - Produto vencido");
        }
    }

    //construtor
    public ProdutoPerecivel(int dia, int validade, String nome, double preço, int id, int qnt) {
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
