package ex5;

public class ViraLata extends Cachorro {

    public ViraLata(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public String toString() {
        return "ViraLata []";
    }

    @Override
    public double getValorDaConsulta () {
        return 0;
    }
    
}
