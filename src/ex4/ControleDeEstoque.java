package ex4;

public class ControleDeEstoque {

    private ProdutoPerecivel produtoP;

    ControleDeEstoque (ProdutoPerecivel produtoP) {
        this.produtoP = produtoP;
    }

    public void verificaEstoque () {
        produtoP.mostraValidade();
    }
    
}
