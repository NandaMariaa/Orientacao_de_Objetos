package ex6;

public class Teste {

    public static void main(String[] args) {

        //ex1
        Aluno a1 = new Aluno("João", 17);
        System.out.println(a1);
        a1.mostraAvaliacao();
        a1.avaliar(7);
        a1.mostraAvaliacao();

        //ex 2
        Funcionario f1 = new Funcionario("Nanda", 18, 2500);
        System.out.println(f1);

        //ex3
        Produto p1 = new Produto ("Limpeza", 20, 150);
    
    }
}