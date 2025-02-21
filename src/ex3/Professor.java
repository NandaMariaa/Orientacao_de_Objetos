package ex3;

public class Professor extends Pessoa {

    private String area;
    private float salario;
    
    //salario ...................
    public void recebeSalario () {

        if(isMatriculaAtiva()) {

            System.out.println(getNome()+ "Recebe R$ " + this.salario + ",00.");
        } else {
            System.out.println("Professor Fora de Atividade.");
        }

    }


    //
    @Override
    public String toString () {
        return "Professor - " +
         " / Área: " + this.area +
         " / Salário: R$ " + this.salario + "0,00" +
         super.toString();


    }
    //construtor
    public Professor(String area, float salario, String nome, int idade, boolean matriculaAtiva) {
        super (nome, idade, matriculaAtiva);
        this.area = area;
        this.salario = salario;
    }


    //getters and setters ........

    //area
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    //salario
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}


