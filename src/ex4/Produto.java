package ex4;

public class Produto {

    private String nome;
    private double preço;
    private int id;
    private int qnt;



    @Override
    public double getValorTotal() {
        if ( isValido() ) {
            return super.getValorTotal();

        } else {
            return 0;
        }

    }
    @Override
    public String toString() {
        return nome + " - " + 
        qnt + " x R$ " + 
        String.format("%.2f",preço) + " = R$" +
        String.format("%.2f",getValorTotal());
    }

    public double getValorTotal () {
        return preço * qnt;
    }

    //contrutor
    public Produto(String nome, double preço, int id, int qnt) {
        this.nome = nome;
        this.preço = preço;
        this.id = id;
        this.qnt = qnt;
    }

    //getters e setters

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreço() {
        return preço;
    }
    public void setPreço(double preço) {
        this.preço = preço;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getQnt() {
        return qnt;
    }
    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

}