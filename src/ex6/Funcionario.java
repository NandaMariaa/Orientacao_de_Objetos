package ex6;

public class Funcionario extends Pessoa {

    private int salario;

    public Funcionario (String nome, int idade, int salario) {

        super(nome, idade, Acessos.completo);

        this.salario = salario;
    }

    @Override
    public String toString() {
        
        return super.toString() + " Salario= " + salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
