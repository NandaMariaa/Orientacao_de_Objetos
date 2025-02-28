package ex4;

public class Main {

    public static void main(String[] args) throws Exception {

        Produto p1 = new Produto("leite", 9.90, 1, 2);
        
        Caixa c1 = new Caixa (p1);
        c1.mostraValor();
        c1.fazCompra();
        

        Produto p2 = new ProdutoP(7, 10, "Leite", 9.90,2, 2);
        Caixa c2 = new Caixa(leite);

        
        ce.verificaEstoque();

        ProdutoP leite2 = (ProdutoP) leite;
        ControleEstq ce = new ControleEstq(leite2);
        ce.verificaEstoque();
    }
    
}
