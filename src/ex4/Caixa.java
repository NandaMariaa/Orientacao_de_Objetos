package ex4;

public class Caixa {

    private Produto produto;

    public Caixa (Produto produto) {

        this.produto = produto;

    }

    public void mostraValor () {

       System.out.println(produto.toString());

    }

    public void fazCompra () {
        System.out.println("Compra realizada. Valor: R$" + 
        String.format("%.2f", produto.getValorTotal()));

    }

}
