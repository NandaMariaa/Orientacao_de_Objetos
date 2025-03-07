package ex5;

public class Pinscher extends Cachorro {

    public Pinscher(String nome) {
        super(nome, 5);
    
    }

    @Override
    public void fazBarulho() {

        System.out.println("Auauauau");

    }

}
