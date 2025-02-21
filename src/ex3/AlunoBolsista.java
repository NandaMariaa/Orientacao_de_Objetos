package ex3;

class AlunoBolsista extends Aluno {

    public AlunoBolsista(String curso, float mensalidade, String nome, int idade, boolean matriculaAtiva) {
        super(curso, mensalidade, nome, idade, matriculaAtiva);
        
    }

    @Override 
    public void pagaMensalidade () {
        System.out.println("Aluno Bolsista Não precisa Pagar");
    }



    
}