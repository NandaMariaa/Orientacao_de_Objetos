package ex5;

public class Gato extends Animal {

    private double descontoExame = 20;

    public Gato(String nome, double peso) {

        super(nome, peso, "Gato");

    }
    
    @Override
    public void fazBarulho() {

        System.out.println("Miau");

    }

    @Override
    public double getValorDoExame () {

        return super.getValorDoExame () - this.descontoExame;

    }

}
