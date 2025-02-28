package ex4;

public class ControleEstq extends ProdutoP {

    ProdutoP produtoP;

    ControleEstq (ProdutoP produtoP) {
        this.produtoP = produtoP;

    }

    public void verificaEstoque () {
        produtoP.mostraValidade();
    }
    
}
