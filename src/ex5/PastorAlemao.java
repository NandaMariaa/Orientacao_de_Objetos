package ex5;

public class PastorAlemao extends Cachorro {

    public PastorAlemao(String nome) {
        
        super(nome, 20);
    
    }

    @Override
    public void fazBarulho() {

        System.out.println("AUAUAUAU");
        
    }
    
}
