package ex3;

public class exemplo3 {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa ("João",30, true);
        Professor pr1 = new Professor("Poo", 5000, "Luiz", 32, false);
        Aluno a1 = new Aluno("Ti", 200, "Maria", 18, false);

        System.out.println(p1);

        p1.fazAniversario();

        System.out.println(p1);

        System.out.println(pr1);
        pr1.fazMatricula();
        System.out.println(pr1);

        System.out.println(a1);
        a1.fazAniversario();
        System.out.println(a1);
        a1.fazMatricula();
        a1.pagaMensalidade();
        
    }
    
}
    